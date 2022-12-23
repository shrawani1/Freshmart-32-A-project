/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Contact {
    
    private String name;
    private long number;
    private String email;
    private String message;

    public Contact(String name,long number,String email,String message){
        this.name=name;
        this.number=number;
        this.email=email;
        this.message=message;
       
    }

    public String getName() {
        return this.name;
    }

    public void setProductId(String name) {
        this.name = name;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
