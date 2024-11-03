package com.xworkz.dressUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DressUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dress";
		String userName="root";
		String password="Xworkzodc@123";
		String updateQuery1="update dress_table set color='white' where id=101";
		String updateQuery2="update dress_table set color='gray' where id=102";
		String updateQuery3="update dress_table set color='badypink' where id =103";
		String updateQuery4="update dress_table set color='silver' where id=104";
		String updateQuery5="update dress_table set color='green' where id=105";
		String updateQuery6="update dress_table set color='brown' where id=106";
		String updateQuery7="update dress_table set color='salmon' where id=107";
		String updateQuery8="update dress_table set color='darkblue' where id=108";
		String updateQuery9="update dress_table set color='navy' where id=109";
		String updateQuery10="update dress_table set color='maroon' where id=110";
		try(Connection connection=DriverManager.getConnection(url,userName,password)){
        	
        	Statement statement=connection.createStatement();
        	statement.executeUpdate(updateQuery1);
        	statement.executeUpdate(updateQuery2);
        	statement.executeUpdate(updateQuery3);
        	statement.executeUpdate(updateQuery4);
        	statement.executeUpdate(updateQuery5);
        	statement.executeUpdate(updateQuery6);
        	statement.executeUpdate(updateQuery7);
        	statement.executeUpdate(updateQuery8);
        	statement.executeUpdate(updateQuery9);
        	statement.executeUpdate(updateQuery10);
        
        if(statement!=null) {
			System.out.println(" table is updated");
		}
		
		
	} 

	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	}
	}


