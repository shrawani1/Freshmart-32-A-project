package controller;

import database.Dbconnection;
import models.Product;

public class ProductController {
    Dbconnection DBconnection;

    // public int addProduct(Product product) {
    //     int id = product.getProductId();
    //     String name = product.getProductName();
    //     int price = product.getProductPrice();
    //     int qty = product.getProductQty();
    //     String category = product.getProductCategory();
    //     String addProductQuery = String.format(
    //             "insert into product_table (productId,productName,productQty,productPrice,productCategory) values(%d,'%s',%d,%d,'%s')",
    //             id,
    //             name, qty, price, category);
    //     System.out.println(addProductQuery);
    //     DBconnection = new Dbconnection();
    //     //int result = DBconnection.execute_command(addProductQuery);
    //     return result;
    // }

    // public int updateProduct(Product product) {
    //     int id = product.getProductId();
    //     String name = product.getProductName();
    //     int price = product.getProductPrice();
    //     int qty = product.getProductQty();
    //     String category = product.getProductCategory();

    //     String updateProductQuery = String.format(
    //             "update product_table set productId = '" + id + "',productName ='" + name + "',productQty='" + qty
    //                     + "',productPrice='" + price + "',productCategory ='" + category + "' where productId ='%d' ",
    //             id,
    //             name, qty, price, category);

    //     System.out.println(updateProductQuery);
    //     DBconnection = new Dbconnection();
    //     //int result = DBconnection.execute_command(updateProductQuery);
    //     return result;
    // }
}
