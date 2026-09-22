package com.dao;

import com.model.Employee;
import com.utility.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    private DBConnection dbConnection = new DBConnection();
    List<Employee> list = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        Connection conn =  dbConnection.dbConnect(); // we need the connection in dao
        // call your procedure here...
        String sql ="{CALL all_emp()}";
        try {
            // prepare the call
            CallableStatement callableStatement = conn.prepareCall(sql);
            // we execute the call/statement

            ResultSet rst = callableStatement.executeQuery();
            while(rst.next()){
                // as long as the rows exists , we will read them in objects
                // and save in list , after that we exit the while loop
                Employee employee = new Employee(
                        rst.getInt("id"),
                        rst.getString("name"),
                        rst.getString("branch"),
                        rst.getString("city"),
                        rst.getString("department")
                );
                list.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        dbConnection.dbClose();
        return list;
    }
}