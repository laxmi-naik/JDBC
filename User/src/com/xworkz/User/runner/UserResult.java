package com.xworkz.User.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserResult {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/user";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query1="SELECT * FROM user_table";
		String query2="SELECT name FROM user_table WHERE email = 'aly@gmail.com' AND phone_no=358794615";
		String query3="SELECT address FROM user_table WHERE name = 'lalitha' AND phone_no = 1254789635";
		String query4="SELECT email FROM user_table WHERE phone_no = 9844312496";
		String query5="SELECT email FROM user_table WHERE phone_no = 5455887565 AND name = 'kiran'";
		String query6="SELECT name FROM user_table WHERE id > 110";


		
		try(Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			Statement statement1 =connection.createStatement();
			ResultSet resultSet1= statement1.executeQuery(query1);
			
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString("name"));
				
			}
			System.out.println("++++++++++++++++++++");
			
			Statement statement2=connection.createStatement();
			ResultSet resultSet2=statement2.executeQuery(query2);
			while(resultSet2.next()) {
				System.out.println(resultSet2.getString("name"));
			}
			System.out.println("++++++++++++++++++++");
			Statement statement3=connection.createStatement();
			ResultSet resultSet3=statement3.executeQuery(query3);
			while(resultSet3.next()) {
				System.out.println(resultSet3.getString("address"));
			}
			System.out.println("++++++++++++++++++++");
			Statement statement4=connection.createStatement();
			ResultSet resultSet4=statement4.executeQuery(query4);
			while(resultSet4.next()) {
				System.out.println(resultSet4.getString("email"));
				
			}
			System.out.println("++++++++++++++++++++");
			Statement statement5=connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(query5);
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("email"));
			}
			System.out.println("++++++++++++++++++++");
			Statement statement6=connection.createStatement();
			ResultSet resultSet6=statement5.executeQuery(query6);
			while(resultSet6.next()) {
				System.out.println(resultSet6.getString("name"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
