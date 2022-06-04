package controllers.EmployeeControllers;

import controllers.ErrorHandler;
import controllers.MainMenuController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.entities.DepartmentEnti;
import models.entities.EmployeeEnti;
import models.services.DepartmentServ;
import models.services.EmployeeServ;
import validators.EmployeeInputException;
import validators.EmployeeValidator;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeEditController {

    @FXML
    private TextField nameTextField, fatherNameTextField, ageTextField, addressTextField, degreeTextField,
            landlineTextField, phoneNumberTextField, positionTextField, salaryTextField;

    @FXML
    private ChoiceBox<String> deptChoiceBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private List<DepartmentEnti> departments;
    private String employeeId, selectedDeptId = null;

    public void setEmployeeId(String employeeId) {
        try {
            this.employeeId = employeeId;
            EmployeeEnti employee = EmployeeServ.getInstance().getEmployeeInfo(employeeId);

            //populate choice box
            departments = DepartmentServ.getInstance().getAllDepartments();
            deptChoiceBox.getItems().add("-----");
            for (DepartmentEnti department : departments) {
                deptChoiceBox.getItems().add(department.getName());
                if(department.getId() != null && department.getId().equals(employee.getDeptId())){
                    selectedDeptId = employee.getDeptId();
                    deptChoiceBox.getSelectionModel().select(department.getName());
                }
            }
            if (employee.getDeptId() == null) deptChoiceBox.getSelectionModel().selectFirst();
            deptChoiceBox.setOnAction(this::changeDept);

            nameTextField.setText(employee.getName());
            fatherNameTextField.setText(employee.getFatherName());
            ageTextField.setText(String.valueOf(employee.getAge()));
            addressTextField.setText(employee.getAddress());
            degreeTextField.setText(employee.getDegree());
            landlineTextField.setText(employee.getLandLine());
            phoneNumberTextField.setText(employee.getPhone());
            positionTextField.setText(employee.getPosition());
            salaryTextField.setText(String.valueOf(employee.getSalary()));
        } catch (SQLException e){
            System.out.println("initialize SQL error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("initialize error: " + e.getMessage());
        }
    }

    private void changeDept(ActionEvent event) {
        if(deptChoiceBox.getSelectionModel().getSelectedIndex() == 0) selectedDeptId = null;
        else selectedDeptId = departments.get(deptChoiceBox.getSelectionModel().getSelectedIndex()-1).getId();
    }

    public void edit(ActionEvent event) throws IOException {
        try{
            //validation
            EmployeeValidator employee = new EmployeeValidator();
            employee.setName(nameTextField.getText().trim()).setFatherName(fatherNameTextField.getText().trim())
                    .setAddress(addressTextField.getText().trim()).setDegree(degreeTextField.getText().trim())
                    .setLandLine(landlineTextField.getText().trim()).setPhone(phoneNumberTextField.getText().trim())
                    .setDeptId(selectedDeptId).setPosition(positionTextField.getText().trim());
            employee.setSAge(ageTextField.getText().trim()).setSSalary(salaryTextField.getText().trim());
            employee.validateInputs();
            employee.setVerifiedIntVariables();

            //save
            employee.setId(employeeId);
            EmployeeServ.getInstance().editEmployee(employee);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            mainMenuController.setStatus("Successfully Edited Employee");
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (EmployeeInputException e){
            ErrorHandler.getInstance().showError(e.getMessage());
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("sql error: " + e.getMessage());
        } catch (Exception e) {
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("error: " + e.getMessage());
        }
    }

    public void cancel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
