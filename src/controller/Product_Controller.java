/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//  Importing Lbraries
import database.DbConnection;
import models.Product;
import java.sql.*;

public class Product_Controller {
    DbConnection dbConnection;

    public int addProduct(Product product) {
        int id = product.getProductId();
        String name = product.getProductName();
        int price = product.getProductPrice();
        int qty = product.getProductQty();
        String category = product.getProductCategory();
        String addProductQuery = String.format(
                "insert into product_table (productId,productName,productQty,productPrice,productCategory) values(%d,'%s',%d,%d,'%s')",
                id,
                name, qty, price, category);
        System.out.println(addProductQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(addProductQuery);
        return result;
    }

    public ResultSet fetchProduct(Product product) {
        String category = product.getProductCategory();
        String selectQuery = "select * from product_table where productCategory='" + category + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet fetchDetails(Product product) {
        String category = product.getProductCategory();
        String selectQuery = "select * from product_table";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet selectDeatils(Product product) {
        String name = product.getProductName();
        String selectQuery = "select productPrice,productQty from product_table where productName='" + name + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int updateProduct(Product product) {
        int id = product.getProductId();
        String name = product.getProductName();
        int price = product.getProductPrice();
        int qty = product.getProductQty();
        String category = product.getProductCategory();

        String updateProductQuery = String.format(
                "update product_table set productId = '" + id + "',productName ='" + name + "',productQty='" + qty
                        + "',productPrice='" + price + "',productCategory ='" + category + "' where productId ='%d' ",
                id,
                name, qty, price, category);

        System.out.println(updateProductQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateProductQuery);
        return result;
    }

    public int deleteProduct(Product product) {
        int id = product.getProductId();
        String name = product.getProductName();
        int price = product.getProductPrice();
        int qty = product.getProductQty();
        String category = product.getProductCategory();

        String deleteProductQuery = String.format("delete from product_table where productId ='%d'", id,
                name, qty, price, category);

        /*
         * String deleteProductQuery =
         * String.format("update product_table set productId = '"+id+"',productName ='"
         * +name+"',productQty='"+qty+"',productPrice='"+price+"',productCategory ='"
         * +category+"' where productId ='%d' ",
         * id,
         * name, qty, price, category);
         */

        System.out.println(deleteProductQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteProductQuery);
        return result;
    }

    public int updateQunatity(Product product) {
        String name = product.getProductName();
        int qunatity = product.getProductQty();

        String query = "update product_table set productQty='" + qunatity + "' where productName='" + name + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

}
