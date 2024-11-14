package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookQuery6 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/books";
		String userName="root";
		String password="Xworkzodc@123";
		String query="select  name from books_table where id>5";
        Connection connection=null;
        try {
        	connection=DriverManager.getConnection(url,userName,password);
        	Statement statement=connection.createStatement();
        	ResultSet result=statement.executeQuery(query);
        	while(result.next()) {
        		System.out.println(result.getString("name"));
        	}
        }
        catch (SQLException e) {
			e.getStackTrace();
		}
	}

}
