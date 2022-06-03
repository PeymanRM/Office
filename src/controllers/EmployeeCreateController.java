package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import validators.EmployeeInputException;
import validators.EmployeeValidator;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeCreateController {

    @FXML
    private TextField nameTextField, fatherNameTextField, ageTextField, addressTextField, degreeTextField,
            landlineTextField, phoneNumberTextField, departmentIdTextField, positionTextField, salaryTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void add(ActionEvent event) throws IOException {
        try{
            //validation
            EmployeeValidator employee = new EmployeeValidator();
            employee.setName(nameTextField.getText().trim()).setFatherName(fatherNameTextField.getText().trim())
                    .setAddress(addressTextField.getText().trim()).setDegree(degreeTextField.getText().trim())
                    .setLandLine(landlineTextField.getText().trim()).setPhone(phoneNumberTextField.getText().trim())
                    .setDeptId(departmentIdTextField.getText().trim()).setPosition(positionTextField.getText().trim());
            employee.setSAge(ageTextField.getText().trim()).setSSalary(salaryTextField.getText().trim());
            employee.validateInputs();
            employee.setVerifiedIntVariables();

            //save
            EmployeeServ.getInstance().saveEmployee(employee);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            //TODO set status of edit in main menu
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (EmployeeInputException e){
            System.out.println("input error: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("sql error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void cancel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
