package models.sevices;

import models.entities.EmployeeEnti;
import models.repositories.EmployeeRepo;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServ implements EmployeeServInterface
{ EmployeeRepo employeeRepo;

    @Override
    public void saveEmployee(EmployeeEnti employee) throws SQLException {
     employeeRepo.insertEmployee(employee);
    }

    @Override
    public int getEmployeesCount(String searchQuery) throws SQLException {
        return employeeRepo.pageCount(searchQuery);
    }

    @Override
    public List<EmployeeEnti> getEmployeesList(String searchQuery, int pageCount) throws SQLException {
         return employeeRepo.getEmployeeList(searchQuery,pageCount);
    }

    @Override
    public EmployeeEnti getEmployeeInfo(String id) throws SQLException {
        return employeeRepo.getEmployeeInfo(id);
    }

    @Override
    public void editEmployee(EmployeeEnti employee) throws SQLException {
        employeeRepo.editEmployee(employee);

    }

    @Override
    public void removeEmployee(String id) throws SQLException {
        employeeRepo.deleteEmployee(id);

    }
    public void commit() throws SQLException {
        employeeRepo.commit();
    }
    public void close() throws SQLException {
        employeeRepo.close();
    }
}
