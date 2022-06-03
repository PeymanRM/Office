package models.sevices;

import models.entities.EmployeeEnti;
import models.repositories.EmployeeRepo;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServ implements EmployeeServInterface
{

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
    public List<EmployeeEnti> getEmployeesList(String searchQuery, int pageCount) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
         return employeeRepo.getEmployeeList(searchQuery,pageCount);
    }

    @Override
    public EmployeeEnti getEmployeeInfo(String id) throws SQLException {
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
    public void removeEmployee(String id) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.deleteEmployee(id);
        employeeRepo.commit();
    }

    @Override
    public List<EmployeeEnti> getDepartmentMembers(String deptId) throws SQLException {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        return employeeRepo.selectDepartmentMembers(deptId);
    }
}
