package in.ddarcitects.model;

import javax.persistence.*;


public class User {

    private Long Id;

    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String userRole;
    private boolean isActive;


    public User() {
    }


    public User(Long id, String fName, String lName, String emailId, String password, String userRole, boolean isActive) {
        Id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.emailId = emailId;
        this.password = password;
        this.userRole = userRole;
        this.isActive = isActive;
    }

    public User(String fName, String lName, String emailId, String password, String userRole, boolean isActive) {
        this.firstName = fName;
        this.lastName = lName;
        this.emailId = emailId;
        this.password = password;
        this.userRole = userRole;
        this.isActive = isActive;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }
}
