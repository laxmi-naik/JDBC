package com.xworkz.phoneUpdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/phone";
		String userName="root";
		String password="Xworkzodc@123";
		String updateQuery1="update phone_table set phone_name='iphone 16 pro max' where id=201";
		String updateQuery2="update phone_table set phone_name='samsung galaxy s24 ulter' where id=202";
		String updateQuery3="update phone_table set phone_name='google pixel 9 pro' where id =203";
		String updateQuery4="update phone_table set phone_name='oneplus 12' where id=204";
		String updateQuery5="update phone_table set phone_name='motorola razr 50 ultra' where id=205";
		String updateQuery6="update phone_table set phone_name='xiaomi 14 ultra' where id=206";
		String updateQuery7="update phone_table set phone_name='oppo find x7 ultra' where id=207";
		String updateQuery8="update phone_table set phone_name='vivo x fold 3 pro' where id=208";
		String updateQuery9="update phone_table set phone_name='realme 13 pro' where id=209";
		String updateQuery10="update phone_table set phone_name='samsung galaxy a15' where id=210";
		Connection connection=null;
		try{
			 connection=DriverManager.getConnection(url,userName,password);
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
