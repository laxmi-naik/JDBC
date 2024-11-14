package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookQuery4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/books";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query="SELECT email,password FROM books_table WHERE phoneNo = 9844312496";
		 try {
			 Connection connection = DriverManager.getConnection(url, userName, password);
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
