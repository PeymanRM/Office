package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.entities.EntityType;
import models.services.DepartmentServ;
import models.services.DepartmentServInterface;
import models.services.EmployeeServ;

import java.io.IOException;
import java.sql.SQLException;

public class DeletePopUpController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private EntityType entityType;
    private String entityId;

    public void initialize(EntityType entityType, String entityId) {
        this.entityType = entityType;
        this.entityId = entityId;
    }

    public void yes(ActionEvent event) throws IOException {
        try {
            switch (entityType) {
                case EMPLOYEE -> EmployeeServ.getInstance().removeEmployee(entityId);
                case DEPARTMENT -> DepartmentServ.getInstance().removeDepartment(entityId);
                //!
//                case DOCUMENT -> DocumentServ.getInstance().removeDepartment(entityId);
            }
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            //TODO set status of edit in main menu
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
            stage = ErrorHandler.getInstance().getStage();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (SQLException e) {
            System.out.println("sql delete error: " + e.getMessage());
        }
    }

    public void no(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
