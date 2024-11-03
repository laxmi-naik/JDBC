package com.xworkz.dressDelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DressDelete {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dress";
		String userName="root";
		String password="Xworkzodc@123";
		String deleteQuery1="delete from dress_table  where id=111";
		String deleteQuery2="delete from dress_table  where id=112";
		String deleteQuery3="delete from dress_table  where id =113";
		String deleteQuery4="delete from dress_table  where id=114";
		String deleteQuery5="delete from dress_table  where id=115";
		String deleteQuery6="delete from dress_table  where id=116";
		String deleteQuery7="delete from dress_table  where id=117";
		String deleteQuery8="delete from dress_table  where id=118";
		String deleteQuery9="delete from dress_table  where id=119";
		String deleteQuery10="delete from dress_table  where id=120";
		try(Connection connection=DriverManager.getConnection(url,userName,password)){
        	
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
