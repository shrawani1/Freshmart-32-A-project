package controller;

import java.sql.ResultSet;

import database.Dbconnection;
// import database.DBconnection;
import models.User;

public class UserController {
    Dbconnection DBconnection;

    public int insertDetails(User user) {
        String username = user.getUsername();
        String pass = user.getuserpass();
        // String repass = user.getuserrepass();

        String insertquery = "insert into user_table(username,password)"
                + "values('" + username + "','" + pass + "')";

        DBconnection = new Dbconnection();
        int result = DBconnection.manipulate(insertquery);
        return result;

    }

    public ResultSet selectQuery(User user) {
        // String username = user.getUsername();
        int id = user.getuserId();
        String pass = user.getuserpass();

        String selectLogin = "select * from manage_seller where seller_id='" + id + "' and password='" + pass + "'";
        DBconnection = new Dbconnection();
        ResultSet result = DBconnection.retrieve(selectLogin);
        return result;

    }

    public int updatestatus(User user) {
        // String username = user.getUsername();
        int id = user.getuserId();
        String updatestatus = "update manage_seller SET status= '" + "active" + "' where seller_id='" + id + "'";
        DBconnection = new Dbconnection();
        int result = DBconnection.manipulate(updatestatus);
        return result;
    }

    public int changeStatus(User user) {
        String changeStatus = "update manage_seller set status='" + "inactive" + "' where status='" + "active" + "'";
        DBconnection = new Dbconnection();
        int result = DBconnection.manipulate(changeStatus);
        return result;
    }

    public ResultSet selectdetails(User user) {
        String selectdetails = "select * from manage_seller where status='" + "active" + "'";
        DBconnection = new Dbconnection();
        ResultSet result = DBconnection.retrieve(selectdetails);
        return result;
    }

}
