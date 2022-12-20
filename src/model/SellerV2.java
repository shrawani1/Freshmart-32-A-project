/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class SellerV2 {
    private int seller_id;
    private String seller_name;
    private String password;
    private String gender;

    public SellerV2(int seller_id, String seller_name, String password, String gender) {
        this.seller_id = seller_id;
        this.seller_name = seller_name;
        this.password = password;
        this.gender = gender;
    }

    public int getSeller_id() {
        return this.seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_name() {
        return this.seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
