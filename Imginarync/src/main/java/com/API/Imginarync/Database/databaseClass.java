package com.API.Imginarync.Database;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class databaseClass {

	  public static Connection Dbconnect() {
	        Connection conn=null;
	        
	        
	        try {
	                Class.forName("com.mysql.jdbc.Driver"); 
	                conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","");
	            } 
	        catch (Exception e) 
	            {
	            System.out.println("Error In connecting to Database"+" "+e);
	            
	             }
	        
	        return conn; 
}
}
