package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ErrorHandler {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private ErrorHandler(){}
    private static ErrorHandler errorHandler = new ErrorHandler();
    public static ErrorHandler getInstance(){
        return errorHandler;
    }

    public ErrorHandler setStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    public void showError(String message){
        try {
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(stage);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Popup.fxml"));
            root = loader.load();
            ErrorPopUpController errorPopUpController = loader.getController();
            errorPopUpController.initialize(message);
            scene = new Scene(root);
            dialog.setScene(scene);
            dialog.setResizable(false);
            dialog.setTitle("ERROR");
            dialog.show();
        } catch (IOException e){
            System.out.println("IOException errorHandler: " + e.getMessage());
        }
    }
}
