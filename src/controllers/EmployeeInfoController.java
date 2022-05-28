package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import models.entities.EmployeeEnti;
import java.io.IOException;
import java.sql.SQLException;

public class EmployeeInfoController {

    @FXML
    private Label idLabel, nameLabel, fatherNameLabel, ageLabel, addressLabel, degreeLabel,
            landlineLabel, phoneNumberLabel, departmentNameLabel, positionLabel, salaryLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String employeeId, previousPageDeptId, previousPageSearchQuery;
    private int previousPagePageNumber;

    public void initialize(String employeeId, String previousPageDeptId, String previousPageSearchQuery, int previousPagePageNumber) {
        this.employeeId = employeeId;
        this.previousPageDeptId = previousPageDeptId;
        this.previousPageSearchQuery = previousPageSearchQuery;
        this.previousPagePageNumber = previousPagePageNumber;

        try {
            EmployeeEnti employee = EmployeeServ.getInstance().getEmployeeInfo(employeeId);
            idLabel.setText(employee.getId());
            nameLabel.setText(employee.getName());
            fatherNameLabel.setText(employee.getFatherName());
            ageLabel.setText(String.valueOf(employee.getAge()));
            addressLabel.setText(employee.getAddress());
            degreeLabel.setText(employee.getDegree());
            landlineLabel.setText(employee.getLandLine());
            phoneNumberLabel.setText(employee.getPhone());
            departmentNameLabel.setText(DepartmentServ.getInstance().getDepartmentName(employee.getDeptId());
            positionLabel.setText(employee.getPosition());
            salaryLabel.setText(String.valueOf(employee.getSalary()));
        } catch(Exception e){
            System.out.println("initialize error: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("initialize SQL error: " + e.getMessage());
        }
    }

    public void loadEditPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Employee_Edit.fxml"));
        root = loader.load();
        EmployeeEditController employeeEditController = loader.getController();
        employeeEditController.setEmployeeId(employeeId);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void delete(ActionEvent event) throws IOException {
        //TODO
    }

    public void back(ActionEvent event) throws IOException {
        if(previousPageDeptId == null){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Employee_View.fxml"));
            root = loader.load();
            EmployeeViewController employeeViewController = loader.getController();
            employeeViewController.initialize(previousPageSearchQuery, previousPagePageNumber);
        }else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Employee_View.fxml"));
            root = loader.load();
            DepartmentInfoController departmentInfoController = loader.getController();
            departmentInfoController.intialize(previousPageDeptId, previousPageSearchQuery, previousPagePageNumber);
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
