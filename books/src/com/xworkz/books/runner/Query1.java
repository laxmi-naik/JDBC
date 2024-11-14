package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/books";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query1="SELECT * FROM books_table";

		try(Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			Statement statement =connection.createStatement();
			ResultSet resultSet= statement.executeQuery(query1);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("id"));
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
				System.out.println(resultSet.getString("address"));
				System.out.println(resultSet.getString("phoneNo"));
				System.out.println(resultSet.getString("titlel"));
				System.out.println(resultSet.getString("author"));
				System.out.println(resultSet.getString("genre"));
				System.out.println(resultSet.getString("publish_date"));
			}
		}
          catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
