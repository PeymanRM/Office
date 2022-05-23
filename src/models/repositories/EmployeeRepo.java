package models.repositories;

import models.entities.EmployeeEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo
{  private Connection connection;
    private PreparedStatement preparedStatement;
    public EmployeeRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Office","root","myjava123");
        connection.setAutoCommit(false);
    }
    public void insertEmployee(EmployeeEnti employee) throws SQLException {
        preparedStatement=connection.prepareStatement("insert into Employee(id,fullName,age,fatherName,address,degree,Landline,Phone,Deptid,position,salary) values (?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,employee.getId());
        preparedStatement.setString(2,employee.getName());
        preparedStatement.setInt(3,employee.getAge());
        preparedStatement.setString(4,employee.getFatherName());
        preparedStatement.setString(5,employee.getAddress());
        preparedStatement.setString(6,employee.getDegree());
        preparedStatement.setString(7,employee.getLandLine());
        preparedStatement.setString(8,employee.getPhone());
        preparedStatement.setInt(9,employee.getDeptId());
        preparedStatement.setString(10,employee.getPosition());
        preparedStatement.setInt(11,employee.getSalary());
        preparedStatement.executeUpdate();
    }
    public EmployeeEnti getInfo() throws SQLException {
//        EmployeeEnti employee=new EmployeeEnti();
//        preparedStatement=connection.prepareStatement("select * from Employee where id=?");
//        preparedStatement.setString(1,employee.getId());
//        ResultSet resultSet=preparedStatement.executeQuery();
//        while (resultSet.next())
//        {
//            employee.setId(resultSet.getString("id"));
//            employee.setName(resultSet.getString("name"));
//            employee.setAge(resultSet.getInt("age"));
//            employee.setFatherName(resultSet.getString("fatherName"));
//            employee.setAddress(resultSet.getString("address"));
//            employee.setDegree(resultSet.getString("degree"));
//            employee.setPhone(resultSet.getString("phone"));
//            employee.setLandLine(resultSet.getString("landLine"));
//            employee.setDeptId(resultSet.getInt("deptId"));
//            employee.setPosition(resultSet.getString("position"));
//            employee.setSalary(resultSet.getInt("salary"));
//        }
//        return employee;

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new EmployeeEnti().setId(resultSet.getString("id")).setName(resultSet.getString("name"))
            .setAge(resultSet.getInt("age")).setFatherName(resultSet.getString("fatherName"))
            .setAddress(resultSet.getString("address")).setPhone(resultSet.getString("phone"))
            .setLandLine(resultSet.getString("landLine")).setDeptId(resultSet.getInt("deptId"))
            .setPosition(resultSet.getString("position")).setSalary(resultSet.getInt("salary"));
    }
   public List<EmployeeEnti> getEmployeeList(String searchQuery,int pageCount) throws SQLException {
        EmployeeEnti employee=new EmployeeEnti();
        List<EmployeeEnti> getEmployeeList=new ArrayList<>();
        if (searchQuery==null)
        {
            preparedStatement=connection.prepareStatement("select id,name,age from Employee");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                getEmployeeList.add(employee.setId(resultSet.getString("id")));
                getEmployeeList.add(employee.setName(resultSet.getString("name")));
                getEmployeeList.add(employee.setAge(resultSet.getInt("age")));
            }
        }
        else
        {
            preparedStatement=connection.prepareStatement("select id,name,age from Employee where name=?");
            preparedStatement.setString(1,employee.getName());
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                getEmployeeList.add(employee.setId(resultSet.getString("id")));
                getEmployeeList.add(employee.setName(resultSet.getString("name")));
                getEmployeeList.add(employee.setAge(resultSet.getInt("age")));
            }
        }
        return getEmployeeList;
    }

}
