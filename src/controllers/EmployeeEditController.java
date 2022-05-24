package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.entities.EmployeeEnti;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;

public class EmployeeEditController {

    @FXML
    private TextField nameTextField, fatherNameTextField, ageTextField, addressTextField, degreeTextField,
            landlineTextField, phoneNumberTextField, departmentIdTextField, positionTextField, salaryTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String employeeId;

    public void setEmployeeId(String employeeId) {
        try {
            EmployeeEnti employee = EmployeeServ.getInstance().getEmployeeInfo(employeeId);
            nameTextField.setText(employee.getName());
            fatherNameTextField.setText(employee.getFatherName());
            ageTextField.setText(String.valueOf(employee.getAge()));
            addressTextField.setText(employee.getAddress());
            degreeTextField.setText(employee.getDegree());
            landlineTextField.setText(employee.getLandLine());
            phoneNumberTextField.setText(employee.getPhone());
            departmentIdTextField.setText(employee.getDeptId());
            positionTextField.setText(employee.getPosition());
            salaryTextField.setText(String.valueOf(employee.getSalary()));
        } catch(Exception e){
            System.out.println("initialize error: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("initialize SQL error: " + e.getMessage());
        }
    }

    public void edit(ActionEvent event) {
        try{

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void cancel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        AuthController.getInstance().logout();
        stage.show();
    }
}
