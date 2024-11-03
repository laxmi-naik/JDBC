package com.xworkz.umbrellaDelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UmbrellaDelete {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/umbrella";
		String userName="root";
		String password="Xworkzodc@123";
		String deleteQuery1="delete from umbrella_table  where id=11";
		String deleteQuery2="delete from umbrella_table  where id=12";
		String deleteQuery3="delete from umbrella_table  where id =13";
		String deleteQuery4="delete from umbrella_table  where id=14";
		String deleteQuery5="delete from umbrella_table  where id=15";
		String deleteQuery6="delete from umbrella_table  where id=16";
		String deleteQuery7="delete from umbrella_table  where id=17";
		String deleteQuery8="delete from umbrella_table  where id=18";
		String deleteQuery9="delete from umbrella_table  where id=19";
		String deleteQuery10="delete from umbrella_table  where id=20";
		
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
