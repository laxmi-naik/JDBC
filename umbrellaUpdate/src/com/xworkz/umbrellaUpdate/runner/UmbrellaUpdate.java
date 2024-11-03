package com.xworkz.umbrellaUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UmbrellaUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/umbrella";
		String userName="root";
		String password="Xworkzodc@123";
		String updateQuery1="update umbrella_table set color='black' where id=1";
		String updateQuery2="update umbrella_table set color='gray' where id=2";
		String updateQuery3="update umbrella_table set color='purple' where id =3";
		String updateQuery4="update umbrella_table set color='silver' where id=4";
		String updateQuery5="update umbrella_table set color='golden' where id=5";
		String updateQuery6="update umbrella_table set color='brown' where id=6";
		String updateQuery7="update umbrella_table set color='salmon' where id=7";
		String updateQuery8="update umbrella_table set color='blue' where id=8";
		String updateQuery9="update umbrella_table set color='navy' where id=9";
		String updateQuery10="update umbrella_table set color='maroon' where id=10";
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
