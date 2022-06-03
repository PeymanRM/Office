package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import models.entities.EmployeeEnti;
import models.sevices.EmployeeServ;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeViewController {

    @FXML
    private GridPane employeesGridPane;

    @FXML
    private TextField searchTextField;

    @FXML
    private ChoiceBox<String> pageChoiceBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    int pageNumber, pageCount;
    String searchQuery;

    public void initialize(String searchQuery, int pageNumber, boolean changedPage){
        try {
            this.pageNumber = pageNumber;

            if(!changedPage) {
                this.searchQuery = searchQuery;
                searchTextField.setText(searchQuery);
                int employeesCount = EmployeeServ.getInstance().getEmployeesCount(searchQuery);
                pageCount = employeesCount % 20 == 0 ? employeesCount / 20 : employeesCount / 20 + 1;
                String[] pages = new String[pageCount];
                for (int i = 0; i < pageCount; i++) {
                    pages[i] = "Page " + (i + 1);
                }
                pageChoiceBox.getItems().clear();
                pageChoiceBox.getItems().addAll(pages);
                pageChoiceBox.getSelectionModel().selectFirst();
            }
            pageChoiceBox.setOnAction(this::changePage);

            fillEmployeesGridPane(EmployeeServ.getInstance().getEmployeesList(searchQuery, pageNumber));
        } catch (SQLException e) {
            System.out.println("view initialize error: " + e.getMessage());
        }
    }

    private void fillEmployeesGridPane(List<EmployeeEnti> employees){
        int counter = 0;
        employeesGridPane.getChildren().clear();
        for (EmployeeEnti employee : employees) {
            Label statusLabel = new Label();
            statusLabel.setText("ID: " + employee.getId() + "\nName: " + employee.getName() + "\nPosition: " + employee.getPosition());
            statusLabel.setTextFill(Color.web("#66fcf1"));
            statusLabel.setPrefSize(368, 211);
            statusLabel.setStyle("-fx-background-color: #19212b; -fx-background-radius: 24px; -fx-font-size: 30px; -fx-padding: 0 0 5 0; -fx-text-alignment: center; -fx-alignment: center; -fx-cursor: hand;");

            statusLabel.setOnMouseClicked(event -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Employee_Information.fxml"));
                    root = loader.load();
                    EmployeeInfoController employeeInfoController = loader.getController();
                    employeeInfoController.initialize(employee.getId(), null, searchQuery, pageNumber);
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    System.out.println("error loading info: " + e.getMessage());
                }
            });
            employeesGridPane.add(statusLabel, counter%5 , (counter-counter%5)/5);
            counter++;
        }
    }

    public void search(ActionEvent event){
        searchQuery = searchTextField.getText().trim();
        initialize(searchQuery, 1, false);
    }

    public void changePage(ActionEvent event){
        if(pageChoiceBox.getSelectionModel().getSelectedIndex() != -1 && pageNumber != pageChoiceBox.getSelectionModel().getSelectedIndex() + 1)
            initialize(searchQuery, pageChoiceBox.getSelectionModel().getSelectedIndex() + 1, true);
    }

    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
