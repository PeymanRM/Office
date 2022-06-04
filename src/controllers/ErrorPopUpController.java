package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ErrorPopUpController {

    @FXML
    private Label errorLabel;

    public void initialize(String message){
        errorLabel.setText(message);
    }

    public void ok(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
