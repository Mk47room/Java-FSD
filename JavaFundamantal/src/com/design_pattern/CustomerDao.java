package com.design_pattern;

public class CustomerDao {

    DBConnection dbConnection = DBConnection.getInstance();
    public void getData(){
        System.out.println("In CustomerDao");
        System.out.println("DBConnection is at loc: " + dbConnection);
        dbConnection.dbConnect();
        // my logic
        dbConnection.dbClose();
    }
}