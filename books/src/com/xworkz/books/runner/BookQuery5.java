package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookQuery5 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/books";
		String userName="root";
		String password="Xworkzodc@123";
		String query="select  email,password from books_table where phoneNo=584692133 and name='Anu'";
        Connection connection=null;
        
        try {
        	connection=DriverManager.getConnection(url,userName,password);
        	Statement statement =connection.createStatement();
        	ResultSet resultSet= statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}
		}
          catch (SQLException e) {
			
			e.printStackTrace();
		}

        	
        
	}

}
