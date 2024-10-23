package com.xworkz.kettle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kettle {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/kettle";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,userName,password);
			if(connection !=null) {
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
