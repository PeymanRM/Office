package controllers;

public class AuthController {
    private AuthController() {}
    private static AuthController authController = new AuthController();
    public static AuthController getInstance() {
        return authController;
    }

    private String loggedInAdmin = null; //stores id of logged in admin

    public String getLoggedInAdmin() {
        return loggedInAdmin;
    }

    public void login(String loggedInAdmin) {
        this.loggedInAdmin = loggedInAdmin;
    }

    public void logout() {
        loggedInAdmin = null;
    }
}
