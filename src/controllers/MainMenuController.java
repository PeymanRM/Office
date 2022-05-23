package controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void loadAddEmployeePage(ActionEvent event){
        renderPage(event, "Employee_Create.fxml");
    }

    public void loadAddDepartmentPage(ActionEvent event){
        renderPage(event, "Department_Create.fxml");
    }

    public void loadAddDocumentPage(ActionEvent event){
        renderPage(event, "Document_Create.fxml");
    }

    public void loadViewEmployeesPage(ActionEvent event){
        renderPage(event, "Employee_View.fxml");
    }

    public void loadViewDepartmentsPage(ActionEvent event){
        renderPage(event, "Department_View.fxml");
    }

    public void loadViewDocumentsPage(ActionEvent event){
        renderPage(event, "Document_View.fxml");
    }

    private void renderPage(Event event, String fxmlFileName) {
        try {
            root = FXMLLoader.load(getClass().getResource("../views/" + fxmlFileName));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("renderPage error: " + e.getMessage());
        }
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
            System.out.println("logout error: " + e.getMessage());
        }
    }
}
