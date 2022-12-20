package controller;

import database.DBconnection;
import models.Product;

public class Product_Controller {
    DBconnection DBconnection;

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
        DBconnection = new DBconnection();
        int result = DBconnection.execute_command(addProductQuery);
        return result;
    }
}
