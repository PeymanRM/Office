package models.repositories;
import java.sql.*;
public class AdminRepo  {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public AdminRepo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }
    public String verifyAdmin(String adminId, String enteredPassword) throws SQLException {

        preparedStatement = connection.prepareStatement("select username from admins");
        ResultSet resultSet=preparedStatement.executeQuery();
        return resultSet.getString("password");

    }
    public void addFirstAdmin() throws SQLException {
        preparedStatement = connection.prepareStatement("insert into admins(username,password) values (?,?)");
        preparedStatement.setString(1, "peyman");
        preparedStatement.setString(2, "peyman123");
        preparedStatement.executeUpdate();


    }

    public void commit() throws SQLException {
        connection.commit();
    }
}