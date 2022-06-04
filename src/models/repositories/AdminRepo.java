package models.repositories;
import java.sql.*;
public class AdminRepo  {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public AdminRepo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }
    public String getPassword(String username) throws SQLException {

        preparedStatement = connection.prepareStatement("select password from admins where username=\"" + username + "\"");
        ResultSet resultSet=preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getString("password");

    }
    public void addFirstAdmin() throws SQLException {
        preparedStatement=connection.prepareStatement("SELECT count(*) from admins");
        ResultSet resultSet= preparedStatement.executeQuery();
        resultSet.next();
        if(resultSet.getInt(1) == 0) {
            preparedStatement = connection.prepareStatement("insert into admins(username,password) values (?,?)");
            preparedStatement.setString(1, "admin");
            preparedStatement.setString(2, "admin");
            preparedStatement.executeUpdate();
        }
    }

    public void commit() throws SQLException {
        connection.commit();
    }
}