package com.library.bean;

public class User {
    private String name;
    private String email;
    private String contact;
    private String password;
    private String cpassword;
    private String userType;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCpassword() { return cpassword; }
    public void setCpassword(String cpassword) { this.cpassword = cpassword; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }
}
