package models.repositories;

import models.entities.EmployeeEnti;
import models.sevices.EmployeeServ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepo {
    Connection connection;
    PreparedStatement preparedStatement;

    public EmployeeRepo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Office", "root", "myjava123");

    }

    public void saveEmployee(EmployeeEnti employee) throws SQLException {


        preparedStatement = connection.prepareStatement("insert into Empeloyee(Id,Full_Name,Age,Father_Name,Address,Degree,Landline,Phone,Detp_Id,Position,Salary values (?,?,?,?,?,?,?,?,?,?,?))");
        preparedStatement.setInt(1,employee.getId());
        preparedStatement.setString(2,employee.getFull_name());
        preparedStatement.setInt(3,employee.getAge());
        preparedStatement.setString(4,employee.getFather_name());
        preparedStatement.setString(5,employee.getAddress());
        preparedStatement.setString(6,employee.getDegree());
        preparedStatement.setString(7,employee.getLandline());
        preparedStatement.setString(8,employee.getPhone());
        preparedStatement.setInt(9,employee.getDept_Id());
        preparedStatement.setString(10,employee.getPosition());
        preparedStatement.setInt(11,employee.getSalary());
        preparedStatement.executeUpdate();


    }
}
