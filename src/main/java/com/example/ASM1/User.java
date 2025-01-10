package com.example.ASM1;
public class User {
    String id;
    String email;
    String password;
    String fullname;
    Boolean admin;

    public User() {
    }

    public User(String id, String email, String password, String fullname, Boolean admin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.admin = admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
