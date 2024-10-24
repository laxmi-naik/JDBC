package com.xworkz.dress.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dress {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dress";
        String userName="root";
        String password="Xworkzodc@123";
        String insertQuery="insert into dress_table values(120,'black',1200)";
        Connection connection=null;
        
        try{
        	connection=DriverManager.getConnection(url,userName,password);
        	Statement statment=connection.createStatement();
        	int changed=statment.executeUpdate(insertQuery);
        
        if(changed >0) {
			System.out.println(" mysql is connected");
		}
		else {
			System.out.println("mysql is not connected");
		}
		
	} 

	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	}

}
