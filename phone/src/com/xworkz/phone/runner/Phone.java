package com.xworkz.phone.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Phone {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/phone";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into phone_table(id, phone_name,cost) values "
				+ "(201, 'realme narzo 20A', 12000)," + "(202, 'oppo', 13000), "
				+ "(203, 'Samsung Galaxy S23 Ultra', 15000)," + "(204,'Apple iPhone 15 Pro Max',14000),"
				+ "(205,'Xiaomi Redmi Note 13 Pro',15000)," + "(206,'Vivo X90',17000),"
				+ "(207,'Tecno Spark 10 Pro',16000)," + "(208,'OnePlus 11',10000)," + "(209,'Realme C55',11000),"
				+ "(210,'Infinix Hot 30',9000)," + "(211,'vivo V27',8000)," + "(212,'Realme 11 Pro+',13000),"
				+ "(213,'Samsung Galaxy A24 4G',12000)," + "(214,'Samsung Galaxy S23+',7000),"
				+ "(215,'Xiaomi Poco X5 Pro',10000)," + "(216,'Samsung Galaxy A14 5G',20000),"
				+ "(217,'Apple iPhone 16',19000)," + "(218,'Xiaomi Redmi 12',18000)," + "(219,'OnePlus 11R',9000),"
				+ "(220,'Realme 12 Pro',15000)";
		

		try(Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			Statement statement = connection.createStatement();
			int updated = statement.executeUpdate(insertQuery);
			if (updated > 0) {
				System.out.println(" mysql is connected");
			} else {
				System.out.println("mysql is not connected");
			}

		}

		catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
