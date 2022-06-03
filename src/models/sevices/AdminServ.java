package models.sevices;

import models.repositories.AdminRepo;
import java.sql.SQLException;
public class AdminServ implements AdminServInterface {
    private AdminServ() {
    }

    private static AdminServ adminServ = new AdminServ();

    public static AdminServ getInstance() {
        return adminServ;
    }

    @Override
    public boolean verifyAdmin(String adminId, String enteredPassword) throws SQLException {
        AdminRepo adminRepo = new AdminRepo();
        return adminRepo.verifyAdmin(adminId, enteredPassword);
    }

    @Override
    public void addFirstAdmin() throws SQLException {
        AdminRepo adminRepo = new AdminRepo();
        adminRepo.addFirstAdmin();
        adminRepo.Commit();

    }
}