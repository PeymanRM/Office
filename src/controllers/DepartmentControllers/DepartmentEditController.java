package controllers.DepartmentControllers;

import controllers.ErrorHandler;
import controllers.MainMenuController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.entities.DepartmentEnti;
import models.services.DepartmentServ;
import validators.DepartmentInputException;
import validators.DepartmentValidator;

import java.io.IOException;
import java.sql.SQLException;

public class DepartmentEditController {

    @FXML
    private TextField nameTextField, dutiesTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private DepartmentEnti preDepartment;

    public void setDepartment(int departmentId) {
        try {
            this.preDepartment = DepartmentServ.getInstance().getDepartmentInfo(departmentId);
            DepartmentEnti department = DepartmentServ.getInstance().getDepartmentInfo(departmentId);
            nameTextField.setText(department.getName());
            dutiesTextField.setText(department.getDuties());
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize SQL error: " + e.getMessage());
        } catch(Exception e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize error: " + e.getMessage());
        }
    }

    public void edit(ActionEvent event) throws IOException {
        try{
            //validation
            DepartmentValidator department = new DepartmentValidator();
            department.setName(nameTextField.getText().trim()).setDuties(dutiesTextField.getText().trim());
            department.validateInputs();

            //save
            preDepartment.setName(nameTextField.getText().trim()).setDuties(dutiesTextField.getText().trim());
            DepartmentServ.getInstance().editDepartment(preDepartment);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            mainMenuController.setStatus("Successfully Edited Department");
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (DepartmentInputException e){
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
