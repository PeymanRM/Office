package models.services;

import models.entities.EmployeeEnti;
import models.repositories.EmployeeRepo;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServ implements EmployeeServInterface
{
    private EmployeeServ() {}
    private static EmployeeServ employeeServ = new EmployeeServ();
    public static EmployeeServ getInstance(){
        return employeeServ;
    }

    @Override
    public void saveEmployee(EmployeeEnti employee) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.insertEmployee(employee);
        employeeRepo.commit();
    }

    @Override
    public int getEmployeesCount(String searchQuery) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        return employeeRepo.pageCount(searchQuery);
    }

    @Override
    public List<EmployeeEnti> getEmployeesList(String searchQuery, int pageNumber) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
         return employeeRepo.getEmployeeList(searchQuery, pageNumber);
    }

    @Override
    public EmployeeEnti getEmployeeInfo(int id) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        return employeeRepo.getEmployeeInfo(id);
    }

    @Override
    public void editEmployee(EmployeeEnti employee) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.editEmployee(employee);
        employeeRepo.commit();
    }

    @Override
    public void removeEmployee(int id) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.deleteEmployee(id);
        employeeRepo.commit();
    }

    @Override
    public List<EmployeeEnti> getDepartmentMembers(int deptId) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        return employeeRepo.selectDepartmentMembers(deptId);
    }
    @Override
    public void evacuateDepartment(int deptId) throws SQLException
    {
        System.out.println("serv: " + deptId);
        EmployeeRepo employeeRepo=new EmployeeRepo();
        employeeRepo.evacuateDepartment(deptId);
        employeeRepo.commit();
    }
}
