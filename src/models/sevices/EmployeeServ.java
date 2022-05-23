package models.sevices;

import models.entities.EmployeeEnti;
import models.repositories.EmployeeRepo;

import java.util.List;

public class EmployeeServ
{
    public void saveEmployee(EmployeeRepo employeeRepo)
    {
       employeeRepo.insertEmployee(EmployeeEnti employee);
    }
    EmployeeEnti getEmployeeInfo(String id)
    {
        EmployeeRepo employeeRepo;
        return employeeRepo.getInfo();
    }
    List<EmployeeEnti> getEmployeeList(String searchQuery,int pageCount)
    {
        EmployeeRepo employeeRepo;
        return employeeRepo.getEmployeeList();
    }
}
