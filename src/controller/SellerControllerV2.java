/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;

import database.Dbconnection;
import models.SellerV2;

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

    public ResultSet fetchDetails() {
        String selectQuery = "select * from manage_seller";
        dBconnection = new Dbconnection();
        ResultSet result = dBconnection.retrieve(selectQuery);
        return result;

    }

    public int updateSeller(SellerV2 sellerV2) {
        int id = sellerV2.getSeller_id();
        String name = sellerV2.getSeller_name();
        String password = sellerV2.getPassword();
        String gender = sellerV2.getGender();

        String updateSeller = "update manage_seller set seller_id = '" + id + "',seller_name ='" + name
                + "',password='" + password + "',gender ='" + gender + "' where seller_id ='" + id + "'";

        System.out.println(updateSeller);
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(updateSeller);
        return result;
    }

    public int deleteseller(SellerV2 sellerV2) {
        int id = sellerV2.getSeller_id();
        String deleteseller = String.format("delete from manage_seller where seller_id ='" + id + "'");

        System.out.println(deleteseller);
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(deleteseller);
        return result;
    }

}
