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
        preparedStatement.setString(9,employee.getDeptId());
        preparedStatement.setString(10,employee.getPosition());
        preparedStatement.setInt(11,employee.getSalary());
        preparedStatement.executeUpdate();
    }
    public EmployeeEnti getEmployeeInfo(String id) throws SQLException {

        preparedStatement=connection.prepareStatement("select * from Employee where id=?");
        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new EmployeeEnti().setId(resultSet.getString("id")).setName(resultSet.getString("name"))
            .setAge(resultSet.getInt("age")).setFatherName(resultSet.getString("fatherName"))
            .setAddress(resultSet.getString("address")).setPhone(resultSet.getString("phone"))
            .setLandLine(resultSet.getString("landLine")).setDeptId(resultSet.getString("deptId"))
            .setPosition(resultSet.getString("position")).setSalary(resultSet.getInt("salary"));
    }
   public List<EmployeeEnti> getEmployeeList(String searchQuery,int pageCount) throws SQLException {
        List<EmployeeEnti> getEmployeeList=new ArrayList<>();
        if (searchQuery==null) {
            EmployeeEnti employee=new EmployeeEnti();
            preparedStatement = connection.prepareStatement("select id,name,position from Employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            employee.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setPosition(resultSet.getString("position"));
            getEmployeeList.add(employee);

        }

        else
        {
            preparedStatement=connection.prepareStatement("select id,name,position from Employee where name=?");
            preparedStatement.setString(1,searchQuery);
            EmployeeEnti employee=new EmployeeEnti();
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            employee.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setPosition(resultSet.getString("position"));
           getEmployeeList.add(employee);
        }
        return getEmployeeList;
    }
    public void editEmployee(EmployeeEnti employee) throws SQLException {
        preparedStatement=connection.prepareStatement("update Employee set fullName=?,age=?,fatherName=?,address=?,'degree'=?,Landline=?,Phone=?,position=?,salary=? where id=?");
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setInt(2,employee.getAge());
        preparedStatement.setString(3,employee.getFatherName());
        preparedStatement.setString(4,employee.getAddress());
        preparedStatement.setString(5,employee.getDegree());
        preparedStatement.setString(6,employee.getLandLine());
        preparedStatement.setString(7,employee.getPhone());
        preparedStatement.setString(8,employee.getPosition());
        preparedStatement.setInt(9,employee.getSalary());
        preparedStatement.setString(10,employee.getId());
        preparedStatement.executeUpdate();
    }
    public void deleteEmployee(String id) throws SQLException {
        preparedStatement=connection.prepareStatement("delete from Employee where id=?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
    }
    public int pageCount(String searchQuery) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("select count (*) from Employee where id=?");
        preparedStatement.setString(1,searchQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        return resultSet.getRow();

    }
    {

    }
    public void close() throws SQLException {
        connection.commit();
        connection.close();
        preparedStatement.close();
    }

}
