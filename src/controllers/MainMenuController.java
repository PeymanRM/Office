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
        renderAddPage(event, "Employee_Create.fxml");
    }

    public void loadAddDepartmentPage(ActionEvent event){
        renderAddPage(event, "Department_Create.fxml");
    }

    public void loadAddDocumentPage(ActionEvent event){
        renderAddPage(event, "Document_Create.fxml");
    }

    public void loadViewEmployeesPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/Employee_View.fxml"));
        root = loader.load();
        EmployeeViewController employeeViewController = loader.getController();
        employeeViewController.initialize("", 1, false);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loadViewDepartmentsPage(ActionEvent event){
        renderAddPage(event, "Department_View.fxml");
    }

    public void loadViewDocumentsPage(ActionEvent event){
        renderAddPage(event, "Document_View.fxml");
    }

    private void renderAddPage(Event event, String fxmlFileName) {
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
