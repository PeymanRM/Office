package controllers.DepartmentControllers;

import controllers.EmployeeControllers.EmployeeInfoController;
import controllers.ErrorHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
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
        List<EmployeeEnti> pageEmployees = employees.subList((pageNumber-1)*10 , Math.min(pageNumber * 10, employees.size()));
        if(!changedPage) {
            int employeesCount = employees.size();
            pageCount = employeesCount % 10 == 0 ? employeesCount / 10 : employeesCount / 10 + 1;
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
            TextFlow statusLabel = new TextFlow();
            Text idText = new Text("ID: ");
            Text idValueText = new Text(String.valueOf(employee.getId()));
            Text nameText = new Text("\nName: " );
            Text nameValueText = new Text(employee.getName());
            Text positionText = new Text("\nPosition: ");
            Text positionValueText = new Text(employee.getPosition());

            idText.getStyleClass().add("grid-pane-text-highlight");
            nameText.getStyleClass().add("grid-pane-text-highlight");
            positionText.getStyleClass().add("grid-pane-text-highlight");
            idValueText.getStyleClass().add("grid-pane-text");
            nameValueText.getStyleClass().add("grid-pane-text");
            positionValueText.getStyleClass().add("grid-pane-text");

            statusLabel.getChildren().addAll(idText, idValueText, nameText, nameValueText, positionText, positionValueText);
            statusLabel.getStyleClass().add("grid-pane-label");
            statusLabel.setPrefWidth(332);
            VBox box = new VBox(statusLabel);
            box.getStyleClass().add("grid-pane-label");

            box.setOnMouseClicked(event -> {
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
            membersGridPane.add(box, counter%5 , (counter-counter%5)/5);
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
