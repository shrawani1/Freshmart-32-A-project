/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBconnection;
import models.Product;

/**
 *
 * @author rajol
 */
public class ProductUpdate {

    DBconnection DBconnection;

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
        DBconnection = new DBconnection();
        int result = DBconnection.execute_command(updateProductQuery);
        return result;
    }

}
