package com.usersapi.model;

/**
 *
 * @author Romel
 */
public class Users {

    private String id_user;
    private String first_name;
    private String last_name;
    private String email;
    private String user_name;
    private String date_of_birth;
    private String date_of_registration;

    public Users() {

    }

    public Users(String id_user, String first_name, String last_name, String email, String user_name, String date_of_birth, String date_of_registration) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.user_name = user_name;
        this.date_of_birth = date_of_birth;
        this.date_of_registration = date_of_registration;

    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(String date_of_registration) {
        this.date_of_registration = date_of_registration;
    }


}
