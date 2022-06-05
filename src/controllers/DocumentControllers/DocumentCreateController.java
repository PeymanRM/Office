package controllers.DocumentControllers;

import controllers.ErrorHandler;
import controllers.MainMenuController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.services.DocumentServ;
import validators.DocumentInputException;
import validators.DocumentValidator;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DocumentCreateController {

    @FXML
    private TextField nameTextField, subjectTextField, senderTextField, receiverTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void add(ActionEvent event) throws IOException {
        try{
            //validation
            DocumentValidator document = new DocumentValidator();
            document.setName(nameTextField.getText().trim()).setSubject(subjectTextField.getText().trim())
                    .setNameOfSender(senderTextField.getText().trim()).setNameOfReceiver(receiverTextField.getText().trim());
            document.validateInputs();

            //getting date and time
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            document.setDate(dtf.format(now).split(" ")[0]).setTime(dtf.format(now).split(" ")[1]);

            //save
            DocumentServ.getInstance().saveDocument(document);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            mainMenuController.setStatus("Successfully Added Document");
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (DocumentInputException e){
            ErrorHandler.getInstance().showError(e.getMessage());
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("sql error: " + e.getMessage());
        } catch (Exception e) {
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("error: " + e.getMessage());
        }
    }

    public void cancel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../../views/Main_View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
