package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    //! Text field IDs might be different
    @FXML
    private TextField usernameTextField, passwordTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event){
        try {
            //! AdminServ and its methods might be different
            if (AdminServ.getInstance().verifyAdmin(usernameTextField.getText().toLowerCase().trim(), passwordTextField.getText())) {
                //switching scene
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Main_View.fxml"));
                root = loader.load();

                    // passing the id of admin to MainMenuController
                MainMenuController mainMenuController = loader.getController();
                mainMenuController.setLoggedInAdmin(usernameTextField.getText().toLowerCase().trim());

                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }else{
                System.out.println("Wrong pass or username");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
