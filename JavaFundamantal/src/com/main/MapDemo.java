package com.main;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Consider a case:     login : username-password
        Map<String,String> map = new HashMap<>();
        // key of type String, value of type String
        // put() uses to add.
        map.put("harry@gmail.com", "harry@123"); // entry-set (Input)
        map.put("ronald@gmail.com" , "ronald@123"); // entry-set (Input)
        //use entrySet for map operations.
        map.entrySet().forEach(Entry ->
                System.out.println(Entry.getKey() + "  -  " + Entry.getValue())
        );

        //Access value by key. use get()
        String value = map.get("harry@gmail.com");
        System.out.println(value);

    }
}
