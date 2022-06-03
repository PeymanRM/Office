package models.entities;

public class AdminEnti {
    private String username,password;

    public String getUsername() {
        return username;
    }

    public AdminEnti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AdminEnti setPassword(String password) {
        this.password = password;
        return this;
    }
}
