package com.xworkz.umberlla.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Umberlla {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/umbrella";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into umbrella_table values(20,'brown',150)";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,userName,password);
			Statement statement=connection.createStatement();
			int updated=statement.executeUpdate(insertQuery);
			if(updated >0) {
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
