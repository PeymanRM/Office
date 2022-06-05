package models.repositories;
import models.entities.DocumentEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocumentRepo{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public DocumentRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }
    public void saveDocument(DocumentEnti document) throws SQLException {
        preparedStatement=connection.prepareStatement("SELECT count(*) from documents");
        ResultSet resultSet= preparedStatement.executeQuery();
        resultSet.next();
        document.setId(String.valueOf(resultSet.getInt(1)+1001));
        preparedStatement=connection.prepareStatement("insert into documents(id,name,subject,nameOfSender,nameOfReceiver,date,time) values (?,?,?,?,?,?,?)");
        preparedStatement.setString(1,document.getId());
        preparedStatement.setString(2,document.getName());
        preparedStatement.setString(3,document.getSubject());
        preparedStatement.setString(4,document.getNameOfSender());
        preparedStatement.setString(5,document.getNameOfReceiver());
        preparedStatement.setString(6, document.getDate());
        preparedStatement.setString(7,document.getTime());
        preparedStatement.executeUpdate();
    }

    public int getDocumentsCount(String searchQuery) throws SQLException {
        preparedStatement = connection.prepareStatement("select count(*) from documents where name LIKE '%" + searchQuery + "%'");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1);
    }


    public List<DocumentEnti> getDocumentsList(String searchQuery, int pageNumber) throws SQLException {
        List<DocumentEnti> getDocumentsList = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select id,name,subject from documents where name LIKE '%" + searchQuery + "%' LIMIT 20 OFFSET " + (pageNumber - 1) * 20);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            DocumentEnti document = new DocumentEnti();
            document.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setSubject(resultSet.getString("subject"));
            getDocumentsList.add(document);
        }
        return getDocumentsList;
    }


    public DocumentEnti getDocumentInfo(String id) throws SQLException {

        preparedStatement=connection.prepareStatement("select * from documents where id=?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new DocumentEnti().setId(resultSet.getString("id")).setName(resultSet.getString("name")).setSubject(resultSet.getString("subject"))
                .setNameOfSender(resultSet.getString("nameOfSender")).setNameOfReceiver(resultSet.getString("nameOfReceiver")).setDate(resultSet.getString("date"))
                .setTime(resultSet.getString("time"));
    }


    public void editDocument(DocumentEnti document) throws SQLException {

        preparedStatement=connection.prepareStatement("update documents set name=?,subject=?,nameOfSender=?,nameOfReceiver=?,date=?,time=? where id=?");
        preparedStatement.setString(1,document.getName());
        preparedStatement.setString(2,document.getSubject());
        preparedStatement.setString(3,document.getNameOfSender());
        preparedStatement.setString(4,document.getNameOfReceiver());
        preparedStatement.setString(5,document.getDate());
        preparedStatement.setString(6,document.getTime());
        preparedStatement.setString(7,document.getId());
        preparedStatement.executeUpdate();

    }

    public void removeDocument(String id) throws SQLException {

        preparedStatement=connection.prepareStatement("delete from documents where id=?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();

    }
    public void close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
    public void commit() throws SQLException {
        connection.commit();
    }
}
