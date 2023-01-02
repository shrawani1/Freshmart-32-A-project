/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Dbconnection;
import models.Product;

/**
 *
 * @author rajol
 */
public class ProductDelete {
        Dbconnection DBconnection;

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
                DBconnection = new Dbconnection();
                int result = DBconnection.manipulate(deleteProductQuery);
                return result;
        }
}
