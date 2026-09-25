package com.design_pattern;

public class ProductDao {

    DBConnection dbConnection = DBConnection.getInstance();
    public void getData(){
        System.out.println("In ProductDao");
        System.out.println("DBConnection is at loc: " + dbConnection);
        dbConnection.dbConnect();
        // my logic
        dbConnection.dbClose();
    }
}