package controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class MainMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void loadAddEmployeePage(ActionEvent event){
        //TODO
    }

    public void loadAddDepartmentPage(ActionEvent event){
        //TODO
    }

    public void loadAddDocumentPage(ActionEvent event){
        //TODO
    }

    public void loadViewEmployeesPage(ActionEvent event){
        //TODO
    }

    public void loadViewDepartmentsPage(ActionEvent event){
        //TODO
    }

    public void loadViewDocumentsPage(ActionEvent event){
        //TODO
    }

    private void renderPage(Event event, String fxmlFileName) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../views/" + fxmlFileName));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("../views/Login.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            AuthController.getInstance().logout();
            stage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
