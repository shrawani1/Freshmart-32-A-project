/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;

import database.Dbconnection;
import model.CategoryV2;

/**
 *
 * @author DELL
 */
public class categoryController {
    Dbconnection dBconnection;

    public int insertdetails(CategoryV2 categoryV2) {
        int SN = categoryV2.getCat_id();
        String name = categoryV2.getCat_name();
        String desc = categoryV2.getDesc();

        String insertQuery = "insert into manage_category(cat_sn,cat_name,cat_description) " + "values('" + SN + "','"
                + name + "','" + desc + "')";
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet fetchDetails() {
        String selectQuery = "select * from manage_category";
        dBconnection = new Dbconnection();
        ResultSet result = dBconnection.retrieve(selectQuery);
        return result;
    }

    public int updateDetails(CategoryV2 categoryV2) {
        int SN = categoryV2.getCat_id();
        String name = categoryV2.getCat_name();
        String desc = categoryV2.getDesc();

        String query = "update manage_category set cat_name='" + name + "',cat_description='" + desc
                + "' where cat_sn='" + SN + "'";
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(query);
        return result;

    }

    public int deleteDetails(CategoryV2 categoryV2) {
        int SN = categoryV2.getCat_id();
        String query = "delete from manage_category where cat_sn='" + SN + "' ";
        dBconnection = new Dbconnection();
        int result = dBconnection.manipulate(query);
        return result;

    }
}
