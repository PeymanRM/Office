package models.repositories;

import models.entities.DepartmentEnti;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepo  {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public DepartmentRepo() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","JavaLearner", "LearningIsFun,HomeworkIsn't");
        connection.setAutoCommit(false);
    }
    public void saveDepartment(DepartmentEnti department) throws SQLException {
        preparedStatement=connection.prepareStatement("SELECT count(*) from departments");
        ResultSet resultSet= preparedStatement.executeQuery();
        resultSet.next();
        department.setId(String.valueOf(resultSet.getInt(1)+1001));
        preparedStatement=connection.prepareStatement("insert into departments(id,name,duties,date,time) values (?,?,?,?,?)");
        preparedStatement.setString(1,department.getId());
        preparedStatement.setString(2,department.getName());
        preparedStatement.setString(3,department.getDuties());
        preparedStatement.setString(4,department.getDate());
        preparedStatement.setString(5,department.getTime());
        preparedStatement.executeUpdate();
    }


    public int getDepartmentsCount(String searchQuery) throws SQLException {
            preparedStatement = connection.prepareStatement("select count(*) from departments where name LIKE '%" + searchQuery + "%'");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt(1);
    }
    public List<DepartmentEnti> getDepartmentsList(String searchQuery, int pageNumber) throws SQLException {
        List<DepartmentEnti> getDepartmentsList=new ArrayList<>();
        preparedStatement=connection.prepareStatement("select id,name from departments where name LIKE '%"+searchQuery+"%' LIMIT 20 OFFSET " + (pageNumber-1)*20);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            DepartmentEnti department=new DepartmentEnti();
            department.setId(resultSet.getString("id")).setName(resultSet.getString("name"));
            getDepartmentsList.add(department);
        }
        return getDepartmentsList;
    }
    public DepartmentEnti getDepartmentInfo(String id) throws SQLException {

        preparedStatement=connection.prepareStatement("select * from departments where id=?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new DepartmentEnti().setId(resultSet.getString("id")).setName(resultSet.getString("name")).setDuties(resultSet.getString("duties")).setDate(resultSet.getString("date")).setTime(resultSet.getString("time"));
    }
    public void editDepartment(DepartmentEnti department) throws SQLException {
        preparedStatement=connection.prepareStatement("update departments set name=?,duties=?,date=?,time=? where id=?");
        preparedStatement.setString(1,department.getName());
        preparedStatement.setString(2,department.getDuties());
        preparedStatement.setString(3,department.getDate());
        preparedStatement.setString(4,department.getTime());
        preparedStatement.setString(5,department.getId());
        preparedStatement.executeUpdate();
    }

    public void removeDepartment(String id) throws SQLException {
        preparedStatement=connection.prepareStatement("delete from departments where id=?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
    }

    public String getDepartmentName(String id) throws SQLException {
        preparedStatement=connection.prepareStatement("select name from departments where id=?");
        preparedStatement.setString(1,id);
        ResultSet resultSet=preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getString("name");

    }
    public void close() throws SQLException {
        connection.close();
        preparedStatement.close();
    }
    public void commit() throws SQLException {
        connection.commit();
    }

    public List<DepartmentEnti> getAllDepartments() throws SQLException {
        List<DepartmentEnti> getDepartmentsList=new ArrayList<>();
        preparedStatement=connection.prepareStatement("select id,name from departments");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            DepartmentEnti department=new DepartmentEnti();
            department.setId(resultSet.getString("id")).setName(resultSet.getString("name"));
            getDepartmentsList.add(department);
        }
        return getDepartmentsList;
    }
}
