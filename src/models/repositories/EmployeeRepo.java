package models.repositories;

import models.entities.EmployeeEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo
{  private Connection connection;
    private PreparedStatement preparedStatement;
    public EmployeeRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }
    public void insertEmployee(EmployeeEnti employee) throws SQLException {
        preparedStatement=connection.prepareStatement("SELECT count(*) from employees");
        ResultSet resultSet=preparedStatement.executeQuery();
        resultSet.next();
        employee.setId(String.valueOf(resultSet.getInt(1)+1001));
        preparedStatement=connection.prepareStatement("insert into employees(id,name,age,fatherName,address,`degree`,landline,phone,deptId,`position`,salary) values (?,?,?,?,?,?,?,?,?,?,?)");
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

        preparedStatement=connection.prepareStatement("select * from employees where id=?");
        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new EmployeeEnti().setId(resultSet.getString("id")).setName(resultSet.getString("name"))
            .setAge(resultSet.getInt("age")).setFatherName(resultSet.getString("fatherName"))
            .setAddress(resultSet.getString("address")).setDegree(resultSet.getString("degree")).setPhone(resultSet.getString("phone"))
            .setLandLine(resultSet.getString("landLine")).setDeptId(resultSet.getString("deptId"))
            .setPosition(resultSet.getString("position")).setSalary(resultSet.getInt("salary"));
    }
   public List<EmployeeEnti> getEmployeeList(String searchQuery,int pageNumber) throws SQLException {
        List<EmployeeEnti> getEmployeeList=new ArrayList<>();
//        if (searchQuery==null) {
//            preparedStatement = connection.prepareStatement("select id, name,`position` from employees LIMIT 20 OFFSET " + (pageNumber-1)*20);
//            ResultSet resultSet = preparedStatement.executeQuery();
//           while (resultSet.next()) {
//               EmployeeEnti employee=new EmployeeEnti();
//               employee.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setPosition(resultSet.getString("position"));
//               getEmployeeList.add(employee);
//           }
//
//        } else {
            preparedStatement=connection.prepareStatement("select id,name,`position` from employees where name LIKE '%"+searchQuery+"%' LIMIT 20 OFFSET " + (pageNumber-1)*20);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                EmployeeEnti employee=new EmployeeEnti();
                employee.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setPosition(resultSet.getString("position"));
                getEmployeeList.add(employee);
            }
//        }
        return getEmployeeList;
    }
    public void editEmployee(EmployeeEnti employee) throws SQLException {
        preparedStatement=connection.prepareStatement("update employees set name=?,age=?,fatherName=?,address=?,`degree`=?,landline=?,phone=?,`position`=?,salary=?, deptId=?  where id=?");
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setInt(2,employee.getAge());
        preparedStatement.setString(3,employee.getFatherName());
        preparedStatement.setString(4,employee.getAddress());
        preparedStatement.setString(5,employee.getDegree());
        preparedStatement.setString(6,employee.getLandLine());
        preparedStatement.setString(7,employee.getPhone());
        preparedStatement.setString(8,employee.getPosition());
        preparedStatement.setInt(9,employee.getSalary());
        preparedStatement.setString(10,employee.getDeptId());
        preparedStatement.setString(11,employee.getId());
        preparedStatement.executeUpdate();
    }
    public void deleteEmployee(String id) throws SQLException {
        preparedStatement=connection.prepareStatement("delete from employees where id=?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
    }
    public int pageCount(String searchQuery) throws SQLException {
//        if(searchQuery == null) {
//            preparedStatement = connection.prepareStatement("SELECT count(*) from employees");
//        } else {
            preparedStatement = connection.prepareStatement("select count(*) from employees where name LIKE '%" + searchQuery + "%'");
//        }
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1);
    }

    public List<EmployeeEnti> selectDepartmentMembers(String deptId) throws SQLException{
        List<EmployeeEnti> departmentMembers = new ArrayList<>();
        preparedStatement=connection.prepareStatement("select id,name,`position` from employees where deptId = " + deptId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            EmployeeEnti employee = new EmployeeEnti();
            employee.setId(resultSet.getString("id")).setName(resultSet.getString("name")).setPosition(resultSet.getString("position"));
            departmentMembers.add(employee);
        }
        return departmentMembers;
    }

    public void close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
    public void commit() throws SQLException {
        connection.commit();
    }

}
