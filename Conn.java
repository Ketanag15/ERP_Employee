package com.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    public Conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///Employee_Management", "root", "Reyn@045");
            s = c.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
