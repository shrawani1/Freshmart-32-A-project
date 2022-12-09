/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lenovo
 */
public class User {
    private String user_username;
    private String user_pass;
    private int user_id;

    public User(String user_username, String user_pass, int user_id) {
        this.user_username = user_username;
        this.user_pass = user_pass;
        this.user_id = user_id;

    }

    public void setUsername(String newUsername) {
        this.user_username = newUsername;
    }

    public String getUsername() {
        return this.user_username;
    }

    public void setUserpass(String newUserpass) {
        this.user_pass = newUserpass;
    }

    public String getuserpass() {
        return this.user_pass;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getuserId() {
        return this.user_id;
    }
}
