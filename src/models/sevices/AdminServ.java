package models.sevices;

import java.sql.SQLException;

public class AdminServ implements AdminServInterface{
    private AdminServ() {}
    private static AdminServ adminServ = new AdminServ();
    public static AdminServ getInstance(){
        return adminServ;
    }

    @Override
    public boolean verifyAdmin(String adminId, String enteredPassword) throws SQLException {
        return true;
    }

    @Override
    public void addFirstAdmin() throws SQLException{

    }
}
