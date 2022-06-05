package controllers.DocumentControllers;

import controllers.ErrorHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import models.entities.DocumentEnti;
import models.entities.EntityType;
import models.services.DocumentServ;

import java.io.IOException;
import java.sql.SQLException;

public class DocumentInfoController {
    
    @FXML
    private Label idLabel, nameLabel, subjectLabel, senderLabel, receiverLabel, dateLabel, timeLabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String previousPageSearchQuery;
    private int previousPagePageNumber, documentId;

    public void initialize(int documentId, String previousPageSearchQuery, int previousPagePageNumber) {
        this.documentId = documentId;
        this.previousPageSearchQuery = previousPageSearchQuery;
        this.previousPagePageNumber = previousPagePageNumber;

        try {
            //setting labels
            DocumentEnti document = DocumentServ.getInstance().getDocumentInfo(documentId);
            idLabel.setText(String.valueOf(document.getId()));
            nameLabel.setText(document.getName());
            subjectLabel.setText(document.getSubject());
            senderLabel.setText(document.getNameOfSender());
            receiverLabel.setText(document.getNameOfReceiver());
            timeLabel.setText(document.getTime());
            dateLabel.setText(document.getDate());
        } catch (SQLException e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize SQL error: " + e.getMessage());
        } catch(Exception e){
            ErrorHandler.getInstance().showError("Something went wrong!");
            System.out.println("initialize error: " + e.getMessage());
        }
    }

    public void loadEditPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Document_Edit.fxml"));
        root = loader.load();
        DocumentEditController documentEditController = loader.getController();
        documentEditController.setDocument(documentId);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void delete(ActionEvent event) throws IOException {
        ErrorHandler.getInstance().showDeletePopUp(EntityType.DOCUMENT, documentId);
    }

    public void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../views/Document_View.fxml"));
        root = loader.load();
        DocumentViewController documentViewController = loader.getController();
        documentViewController.initialize(previousPageSearchQuery, previousPagePageNumber, false);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
