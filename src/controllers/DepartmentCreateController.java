package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.services.DepartmentServ;
import validators.DepartmentInputException;
import validators.DepartmentValidator;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DepartmentCreateController {

    @FXML
    private TextField nameTextField, dutiesTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void add(ActionEvent event) throws IOException {
        try{
            //validation
            DepartmentValidator department = new DepartmentValidator();
            department.setName(nameTextField.getText().trim()).setDuties(dutiesTextField.getText().trim());
            department.validateInputs();

            //getting date and time
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            department.setDate(dtf.format(now).split(" ")[0]).setTime(dtf.format(now).split(" ")[1]);

            //save
            DepartmentServ.getInstance().editDepartment(department);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            //TODO set status of edit in main menu
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (DepartmentInputException e){
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
