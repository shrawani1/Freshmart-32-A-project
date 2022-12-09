package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user) {
        String username = user.getUsername();
        String pass = user.getuserpass();
        // String repass = user.getuserrepass();

        String insertquery = "insert into user_table(username,password)"
                + "values('" + username + "','" + pass + "')";

        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertquery);
        return result;

    }

    public ResultSet selectQuery(User user) {
        // String username = user.getUsername();
        int id = user.getuserId();
        String pass = user.getuserpass();

        String selectLogin = "select * from manage_seller where seller_id='" + id + "' and password='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectLogin);
        return result;

    }

    public int updatestatus(User user) {
        // String username = user.getUsername();
        int id = user.getuserId();
        String updatestatus = "update manage_seller SET status= '" + "active" + "' where seller_id='" + id + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updatestatus);
        return result;
    }

    public int changeStatus(User user) {
        String changeStatus = "update manage_seller set status='" + "inactive" + "' where status='" + "active" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(changeStatus);
        return result;
    }

    public ResultSet selectdetails(User user) {
        String selectdetails = "select * from manage_seller where status='" + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectdetails);
        return result;
    }

}
