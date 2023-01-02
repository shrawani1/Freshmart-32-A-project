/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Dbconnection;
import models.Contact;

public class Contact_controller {

    Dbconnection dbConnection;

    public int addContact(Contact contactus) {

        String name = contactus.getName();
        long number = contactus.getNumber();
        String email = contactus.getEmail();
        String message = contactus.getMessage();
        String addContactQuery = String.format(
                "insert into contact_table (name,number,email,message) values('%s',%d,'%s','%s')",
                name,
                number, email, message);
        System.out.println(addContactQuery);
        dbConnection = new Dbconnection();
        int result = dbConnection.manipulate(addContactQuery);
        return result;
    }

}
