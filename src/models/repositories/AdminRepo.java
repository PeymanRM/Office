package models.repositories;
import java.sql.*;
import models.entities.AdminEnti;
import models.services.AdminServInterface;
public class AdminRepo implements AdminServInterface {
    boolean swtch;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public AdminRepo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }

    @Override
    public boolean verifyAdmin(String adminId, String enteredPassword) throws SQLException {
        AdminEnti admin = new AdminEnti();
        preparedStatement = connection.prepareStatement("select * from admins where username=?");
        preparedStatement.setString(1, adminId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            admin.setUsername(((ResultSet) resultSet).getString("username"));
            admin.setPassword(resultSet.getString("password"));
        }
        if (adminId.equals(admin.getUsername()) && enteredPassword.equals(admin.getPassword())) {
            swtch = true;
        } else {
            swtch = false;
        }
        return swtch;
    }

    @Override
    public void addFirstAdmin() throws SQLException {
        preparedStatement = connection.prepareStatement("insert into admins(username,password) values (?,?)");
        preparedStatement.setString(1, "peyman");
        preparedStatement.setString(2, "peyman123");
        preparedStatement.executeUpdate();


    }

    public void Commit() throws SQLException {
        connection.commit();
    }
}