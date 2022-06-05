package controllers.DepartmentControllers;

import controllers.EmployeeControllers.EmployeeInfoController;
import controllers.ErrorHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import models.entities.DepartmentEnti;
import models.entities.EmployeeEnti;
import models.entities.EntityType;
import models.services.DepartmentServ;
import models.services.EmployeeServ;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentInfoController {

    @FXML
    private GridPane membersGridPane;

    @FXML
    private ChoiceBox<String> pageChoiceBox;

    @FXML
    private Label idLabel, nameLabel, dutiesLabel, timeLabel, dateLabel, membersCountLabel, noResultLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String previousPageSearchQuery;
    private int previousPagePageNumber, departmentId;

    int pageNumber, pageCount;
    List<EmployeeEnti> employees;

    public void initialize(int departmentId, String previousPageSearchQuery, int previousPagePageNumber) {
        this.departmentId = departmentId;
        this.previousPageSearchQuery = previousPageSearchQuery;
        this.previousPagePageNumber = previousPagePageNumber;

        try {
            //setting labels
            DepartmentEnti department = DepartmentServ.getInstance().getDepartmentInfo(departmentId);
            idLabel.setText(String.valueOf(department.getId()));
            nameLabel.setText(department.getName());
            dutiesLabel.setText(department.getDuties());
            timeLabel.setText(department.getTime());
            dateLabel.setText(department.getDate());

            employees = EmployeeServ.getInstance().getDepartmentMembers(departmentId);
            membersCountLabel.setText(String.valueOf(employees.size()));
            if(employees.size() != 0)
                initiateMembersSection(1,false);
            else noResultLabel.setVisible(true);
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize SQL error: " + e.getMessage());
        } catch(Exception e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize error: " + e.getMessage());
        }
    }

    private void initiateMembersSection(int pageNumber, boolean changedPage){
        this.pageNumber = pageNumber;
        List<EmployeeEnti> pageEmployees = employees.subList((pageNumber-1)*14 , Math.min(pageNumber * 14, employees.size()));
        if(!changedPage) {
            int employeesCount = employees.size();
            pageCount = employeesCount % 14 == 0 ? employeesCount / 14 : employeesCount / 14 + 1;
            String[] pages = new String[pageCount];
            for (int i = 0; i < pageCount; i++) {
                pages[i] = "Page " + (i + 1);
            }
            pageChoiceBox.getItems().clear();
            pageChoiceBox.getItems().addAll(pages);
            pageChoiceBox.getSelectionModel().selectFirst();
        }
        pageChoiceBox.setOnAction(this::changePage);

        fillEmployeesGridPane(pageEmployees);
    }

    private void fillEmployeesGridPane(List<EmployeeEnti> employees){
        membersGridPane.getChildren().clear();
        noResultLabel.setVisible(false);

        int counter = 0;
        for (EmployeeEnti employee : employees) {
            Label statusLabel = new Label();
            statusLabel.setText("ID: " + employee.getId() + "\nName: " + employee.getName() + "\nPosition: " + employee.getPosition());
            statusLabel.setTextFill(Color.web("#66fcf1"));
            statusLabel.setPrefSize(235, 205);
            statusLabel.setStyle("-fx-background-color: #19212b; -fx-background-radius: 24px; -fx-font-size: 25px; -fx-padding: 0 0 5 0; -fx-text-alignment: center; -fx-alignment: center; -fx-cursor: hand;");

            statusLabel.setOnMouseClicked(event -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Employee_Information.fxml"));
                    root = loader.load();
                    EmployeeInfoController employeeInfoController = loader.getController();
                    employeeInfoController.initialize(employee.getId(), departmentId, previousPageSearchQuery, previousPagePageNumber);
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    ErrorHandler.getInstance().showError("Something went wrong!");
                    System.out.println("error loading info: " + e.getMessage());
                }
            });
            membersGridPane.add(statusLabel, counter%7 , (counter-counter%7)/7);
            counter++;
        }
    }

    public void loadEditPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Department_Edit.fxml"));
        root = loader.load();
        DepartmentEditController departmentEditController = loader.getController();
        departmentEditController.setDepartment(departmentId);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void delete(ActionEvent event) throws IOException {
        ErrorHandler.getInstance().showDeletePopUp(EntityType.DEPARTMENT, departmentId);
    }

    public void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Department_View.fxml"));
        root = loader.load();
        DepartmentViewController departmentViewController = loader.getController();
        departmentViewController.initialize(previousPageSearchQuery, previousPagePageNumber, false);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changePage(ActionEvent event){
        if(pageChoiceBox.getSelectionModel().getSelectedIndex() != -1 && pageNumber != pageChoiceBox.getSelectionModel().getSelectedIndex() + 1)
            initiateMembersSection(pageChoiceBox.getSelectionModel().getSelectedIndex() + 1, true);
    }
}
