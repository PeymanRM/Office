package controllers.DepartmentControllers;

import controllers.ErrorHandler;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import models.entities.DepartmentEnti;
import models.services.DepartmentServ;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentViewController {

    @FXML
    private GridPane departmentsGridPane;

    @FXML
    private TextField searchTextField;

    @FXML
    private ChoiceBox<String> pageChoiceBox;

    @FXML
    private Label noResultLabel;

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
                int departmentsCount = DepartmentServ.getInstance().getDepartmentsCount(searchQuery);
                pageCount = departmentsCount % 20 == 0 ? departmentsCount / 20 : departmentsCount / 20 + 1;
                String[] pages = new String[pageCount];
                for (int i = 0; i < pageCount; i++) {
                    pages[i] = "Page " + (i + 1);
                }
                pageChoiceBox.getItems().clear();
                pageChoiceBox.getItems().addAll(pages);
                pageChoiceBox.getSelectionModel().select(pageNumber-1);
            }
            pageChoiceBox.setOnAction(this::changePage);

            fillDepartmentsGridPane(DepartmentServ.getInstance().getDepartmentsList(searchQuery, pageNumber));
        } catch (SQLException e) {
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("view initialize error: " + e.getMessage());
        }
    }

    private void fillDepartmentsGridPane(List<DepartmentEnti> departments){
        departmentsGridPane.getChildren().clear();

        if (departments.size() == 0){
            noResultLabel.setVisible(true);
            return;
        }
        noResultLabel.setVisible(false);

        int counter = 0;
        for (DepartmentEnti department : departments) {
            TextFlow statusLabel = new TextFlow();
            Text idText = new Text("ID: ");
            Text idValueText = new Text(String.valueOf(department.getId()));
            Text nameText = new Text("\nName: " );
            Text nameValueText = new Text(department.getName());

            idText.getStyleClass().add("grid-pane-text-highlight");
            nameText.getStyleClass().add("grid-pane-text-highlight");
            idValueText.getStyleClass().add("grid-pane-text");
            nameValueText.getStyleClass().add("grid-pane-text");

            statusLabel.getChildren().addAll(idText, idValueText, nameText, nameValueText);
            statusLabel.getStyleClass().add("grid-pane-label");
            statusLabel.setPrefWidth(368);
            VBox box = new VBox(statusLabel);
            box.getStyleClass().add("grid-pane-label");

            box.setOnMouseClicked(event -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Department_Information.fxml"));
                    root = loader.load();
                    DepartmentInfoController departmentInfoController = loader.getController();
                    departmentInfoController.initialize(department.getId(), searchQuery, pageNumber);
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    ErrorHandler.getInstance().showError("Something went wrong!");
                    System.out.println("error loading info: " + e.getMessage());
                }
            });
            departmentsGridPane.add(box, counter%5 , (counter-counter%5)/5);
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
        root = FXMLLoader.load(getClass().getResource("../../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
