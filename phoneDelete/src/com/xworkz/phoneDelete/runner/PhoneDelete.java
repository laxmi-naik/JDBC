package com.xworkz.phoneDelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneDelete {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/phone";
		String userName="root";
		String password="Xworkzodc@123";
		String deleteQuery1="delete from phone_table  where id=211";
		String deleteQuery2="delete from phone_table  where id=212";
		String deleteQuery3="delete from phone_table  where id =213";
		String deleteQuery4="delete from phone_table  where id=214";
		String deleteQuery5="delete from phone_table  where id=215";
		String deleteQuery6="delete from phone_table  where id=216";
		String deleteQuery7="delete from phone_table  where id=217";
		String deleteQuery8="delete from phone_table  where id=218";
		String deleteQuery9="delete from phone_table  where id=219";
		String deleteQuery10="delete from phone_table  where id=220";
		
		try{
			Connection connection=DriverManager.getConnection(url,userName,password);
        	Statement statement=connection.createStatement();
        	statement.executeUpdate(deleteQuery1);
        	statement.executeUpdate(deleteQuery2);
        	statement.executeUpdate(deleteQuery3);
        	statement.executeUpdate(deleteQuery4);
        	statement.executeUpdate(deleteQuery5);
        	statement.executeUpdate(deleteQuery6);
        	statement.executeUpdate(deleteQuery7);
        	statement.executeUpdate(deleteQuery8);
        	statement.executeUpdate(deleteQuery9);
        	statement.executeUpdate(deleteQuery10);
        
        if(statement!=null) {
			System.out.println(" table is delete");
		}
		
		
	} 

	catch (SQLException e) {
		
		e.printStackTrace();
	}

	}

}
