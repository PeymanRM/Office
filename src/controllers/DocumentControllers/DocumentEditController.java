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
import models.entities.DocumentEnti;
import models.services.DocumentServ;
import validators.DocumentInputException;
import validators.DocumentValidator;

import java.io.IOException;
import java.sql.SQLException;

public class DocumentEditController {

    @FXML
    private TextField nameTextField, subjectTextField, senderTextField, receiverTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private DocumentEnti preDocument;

    public void setDocument(String documentId) {
        try {
            this.preDocument = DocumentServ.getInstance().getDocumentInfo(documentId);
            DocumentEnti document = DocumentServ.getInstance().getDocumentInfo(documentId);
            nameTextField.setText(document.getName());
            subjectTextField.setText(document.getSubject());
            senderTextField.setText(document.getNameOfSender());
            receiverTextField.setText(document.getNameOfReceiver());
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize SQL error: " + e.getMessage());
        } catch(Exception e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize error: " + e.getMessage());
        }
    }

    public void edit(ActionEvent event) throws IOException {
        try{
            //validation
            DocumentValidator document = new DocumentValidator();
            document.setName(nameTextField.getText().trim()).setSubject(subjectTextField.getText().trim())
                            .setNameOfSender(senderTextField.getText().trim()).setNameOfReceiver(receiverTextField.getText().trim());
            document.validateInputs();

            //save
            preDocument.setName(nameTextField.getText().trim()).setSubject(subjectTextField.getText().trim())
                    .setNameOfSender(senderTextField.getText().trim()).setNameOfReceiver(receiverTextField.getText().trim());
            DocumentServ.getInstance().editDocument(preDocument);

            //switch scene
            FXMLLoader loader = new FXMLLoader (getClass().getResource("../../views/Main_View.fxml"));
            root = loader.load();
            MainMenuController mainMenuController = loader.getController();
            mainMenuController.setStatus("Successfully Edited Document");
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
