package models.services;

import models.entities.DepartmentEnti;
import models.repositories.DepartmentRepo;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServ implements DepartmentServInterface {
    private DepartmentServ() {}
    private static DepartmentServ departmentServ= new DepartmentServ();
    public static DepartmentServ getInstance(){return departmentServ;}

    @Override
    public void saveDepartment(DepartmentEnti department) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        departmentRepo.saveDepartment(department);
        departmentRepo.commit();
    }

    @Override
    public int getDepartmentsCount(String searchQuery) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        return departmentRepo.getDepartmentsCount(searchQuery);
    }

    @Override
    public List<DepartmentEnti> getDepartmentsList(String searchQuery, int pageNumber) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        return departmentRepo.getDepartmentsList(searchQuery,pageNumber);
    }

    @Override
    public DepartmentEnti getDepartmentInfo(int id) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        return departmentRepo.getDepartmentInfo(id);
    }

    @Override
    public void editDepartment(DepartmentEnti department) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        departmentRepo.editDepartment(department);
        departmentRepo.commit();
    }

    @Override
    public void removeDepartment(int id) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        departmentRepo.removeDepartment(id);
        departmentRepo.commit();
    }

    @Override
    public String getDepartmentName(int id) throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
         return departmentRepo.getDepartmentName(id);
    }

    @Override
    public List<DepartmentEnti> getAllDepartments() throws SQLException {
        DepartmentRepo departmentRepo=new DepartmentRepo();
        return departmentRepo.getAllDepartments();
    }
}
