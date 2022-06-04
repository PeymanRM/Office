package models.services;

import models.entities.DocumentEnti;

import java.sql.SQLException;
import java.util.List;

public interface DocumentServInterface {
    /**
     * Gets a document's information in form of a DocumentEnti object to be
     * passed to DocumentRepo for being saved in the database.
     * @param document a DocumentEnti object containing a document's information to be added to the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void saveDocument (DocumentEnti document) throws SQLException;

    /**
     * Searches among the documents based on searchQuery and gives
     * the count of documents that the search result has, to be used
     * in determining the page counts required to be shown in UI
     * @param searchQuery what to be searched for
     * @return the count of documents that the search result has
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    int getDocumentsCount (String searchQuery) throws SQLException;

    /**
     * Searches among the documents based on searchQuery and
     * gives a limited list of documents as DocumentEnti objects
     * filled with only necessary information, including: id, name and position.
     * The result is based on the page count and search query;
     * @param searchQuery what to be searched for
     * @param pageNumber the page number that user(admin) wants
     * @return a list of DocumentEnti objects filled with id, name and position.
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    List<DocumentEnti> getDocumentsList (String searchQuery, int pageNumber) throws SQLException;

    /**
     * Gets the id of a document and returns all its information
     * in form of a DocumentEnti object
     * @param id id of the wanted document
     * @return information of the document
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    DocumentEnti getDocumentInfo (String id) throws SQLException;

    /**
     * Gets a document's information in form of a DocumentEnti object to be
     * passed to DocumentRepo for being replaced with the old information of the document.
     * @param document a DocumentEnti object containing a document's information to be edited in the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void editDocument(DocumentEnti document) throws SQLException;

    /**
     * Gets a document's id and calls a DocumentRepo method
     * to delete it from the database
     * @param id id of the document you want to remove
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void removeDocument(String id) throws SQLException;
}
