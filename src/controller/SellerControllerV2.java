/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Dbconnection;
import model.SellerV2;

/**
 *
 * @author DELL
 */
public class SellerControllerV2 {
    Dbconnection dBconnection;

    public int insertDetails(SellerV2 sellerV2) {
        int seller_id = sellerV2.getSeller_id();
        String seller_name = sellerV2.getSeller_name();
        String password = sellerV2.getPassword();
        String gender = sellerV2.getGender();

        String insertQuery = "insert into manage_seller(seller_id,seller_name,password,gender)" + "values('" + seller_id
                + "','" + seller_name + "','" + password + "','" + gender + "')";
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(insertQuery);
        return result;
    }
}
