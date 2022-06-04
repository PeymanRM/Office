package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.services.AdminServ;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameTextField, passwordTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException{
        try {
            if (AdminServ.getInstance().verifyAdmin(usernameTextField.getText().toLowerCase().trim(), passwordTextField.getText())) {
                //switching scene
                AuthController.getInstance().login(usernameTextField.getText().toLowerCase().trim());
                root = FXMLLoader.load(getClass().getResource("../views/Main_View.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }else{
                ErrorHandler.getInstance().showError("Wrong username or password!");
            }
        } catch(Exception e){
            if(e.getMessage().equals("Illegal operation on empty result set.")) ErrorHandler.getInstance().showError("Wrong username or password!");
            else{
                ErrorHandler.getInstance().showError("Something went wrong!");
                System.out.println(e.getMessage());
            }
        }
    }
}
