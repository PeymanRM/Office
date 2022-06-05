package models.services;

import models.entities.DocumentEnti;
import models.repositories.DocumentRepo;

import java.sql.SQLException;
import java.util.List;

public class DocumentServ implements DocumentServInterface{
    private DocumentServ() {}
    private static DocumentServ documentServ= new DocumentServ();
    public static DocumentServ getInstance(){return documentServ;}
    @Override
    public void saveDocument(DocumentEnti document) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        documentRepo.saveDocument(document);
        documentRepo.commit();
    }

    @Override
    public int getDocumentsCount(String searchQuery) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        return documentRepo.getDocumentsCount(searchQuery);
    }

    @Override
    public List<DocumentEnti> getDocumentsList(String searchQuery, int pageNumber) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        return documentRepo.getDocumentsList(searchQuery,pageNumber);
    }

    @Override
    public DocumentEnti getDocumentInfo(int id) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        return documentRepo.getDocumentInfo(id);
    }

    @Override
    public void editDocument(DocumentEnti document) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        documentRepo.editDocument(document);
        documentRepo.commit();

    }

    @Override
    public void removeDocument(int id) throws SQLException {
        DocumentRepo documentRepo=new DocumentRepo();
        documentRepo.removeDocument(id);
        documentRepo.commit();

    }
}
