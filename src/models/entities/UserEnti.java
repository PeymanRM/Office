package models.entities;

public class UserEnti {
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public UserEnti setUsername(String username) {
        Username = username;
        return this;
    }

    public String getPassword() {
        return Password;
    }

    public UserEnti setPassword(String password) {
        Password = password;
        return this;
    }
}
