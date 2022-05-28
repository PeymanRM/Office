package models.sevices;

public interface AdminServInterface {

    /**
     * Gets id of an admin and checks if entered password
     * and the actual password of the admins match
     * @param adminId the entered id in the login menu
     * @param enteredPassword the entered password in the login menu
     * @return true, if passwords match and false if they don't
     */
    boolean verifyPassword(String adminId, String enteredPassword);

    /**
     * Checks the database and adds an admin if
     * there is no admin in the table.
     */
    void addFirstAdmin();
}
