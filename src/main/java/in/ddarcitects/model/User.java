package in.ddarcitects.model;

import javax.persistence.*;


public class User {

    private Long Id;
    private String fName;
    private String lName;
    private String emailId;
    private String password;
    private String userRole;
    private boolean isActive;


    public User() {
    }


    public User(Long id, String fName, String lName, String emailId, String password, String userRole, boolean isActive) {
        Id = id;
        this.fName = fName;
        this.lName = lName;
        this.emailId = emailId;
        this.password = password;
        this.userRole = userRole;
        this.isActive = isActive;
    }

    public User(String fName, String lName, String emailId, String password, String userRole, boolean isActive) {
        this.fName = fName;
        this.lName = lName;
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

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
