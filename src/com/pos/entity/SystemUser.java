package com.pos.entity;

public class SystemUser {
    private String userId;
    private String f_name;
    private String l_name;
    private String email;
    private String contact_no;
    private String password;
    
    public SystemUser() {
    }

    public SystemUser(String userId, String f_name, String l_name, String email, String contact_no, String password) {
        this.userId = userId;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.contact_no = contact_no;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
