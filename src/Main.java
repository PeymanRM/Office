import controllers.ErrorHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.services.AdminServ;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try{
            AdminServ.getInstance().addFirstAdmin();
        }catch (SQLException e){
            System.out.println("add first error: " + e.getMessage());
        }
        Parent root = FXMLLoader.load(getClass().getResource("views/Login.fxml"));
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("./views/css/styles.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Office");
        stage.setResizable(false);
        stage.setMaximized(true);
        //TODO add icon
        ErrorHandler.getInstance().setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
