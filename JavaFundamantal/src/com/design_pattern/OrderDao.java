package com.design_pattern;

public class OrderDao {

    DBConnection dbConnection = DBConnection.getInstance();
    public void getData(){
        System.out.println("In OrderDao");
        System.out.println("DBConnection is at loc: " + dbConnection);
        dbConnection.dbConnect();
        // my logic
        dbConnection.dbClose();
    }
}