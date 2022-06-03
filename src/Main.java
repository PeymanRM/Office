import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.sevices.AdminServ;

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
        //TODO add icon
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
