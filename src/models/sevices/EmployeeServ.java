package models.sevices;

import models.entities.EmployeeEnti;
import models.repositories.EmployeeRepo;

import java.sql.SQLException;

public class EmployeeServ {
    public void saveEmployee(EmployeeRepo employee1) throws SQLException {
        EmployeeEnti employee=new EmployeeEnti();
        employee1.saveEmployee(employee);
    }
}
