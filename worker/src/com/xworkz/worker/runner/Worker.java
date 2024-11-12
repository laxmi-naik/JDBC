package com.xworkz.worker.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Worker {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/workers";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into workers_table(id, name, email, password, address, phone_no, position, department, salary, hire_date, manager_id, office_location) values "
				+ "(101,'laxmi', 'laxmi@gmail.com', 'laxmi@123', 'rajaji nagar', '9844312496','Software Engineer', 'IT', 70000, '2020-01-01', 101, 'Building A')," 
				+ "(102,'bhavya', 'bhavya@gmail.com', 'bhavya@123', 'Koramangala', '444544445', 'Project Manager', 'IT', 90000, '2019-02-15', 102, 'Building B' ),"
				+ "(103,'swati', 'swati@gmail.com', 'swati@123', 'Whitefield', '2545445454','HR Manager', 'HR', 75000, '2018-03-20', 103, 'Building C'  )," 
				+ "(104,'anu', 'anu@gmail.com', 'anu@123', 'M.G. Road', '211113344','Data Analyst', 'Finance', 65000, '2021-04-25', 104, 'Building A')," 
				+ "(105,'samarth', 'samarth@gmail.com', 'samarth@123', 'Indiranagar', '1555789546','DevOps Engineer', 'IT', 72000, '2022-05-30', 101, 'Building B'  ),"
				+ "(106,'chanagond', 'chanagond@gmail.com', 'chanagond@123', 'Jayanagar', '324569874','Marketing Specialist', 'Marketing', 68000, '2017-06-10', 105, 'Building C' ),"
				+ "(107,'lalitha', 'lalitha@gmail.com', 'lalitha@123', 'Hebbal', '1254789635','Sales Executive', 'Sales', 70000, '2016-07-15', 106, 'Building A' )," 
				+ "(108,'soni', 'soni@gmail.com', 'soni@123', 'Malleshwaram', '359874561','Business Analyst', 'Business', 85000, '2015-08-20', 107, 'Building B' )," 
				+ "(109,'aly', 'aly@gmail.com', 'aly@123', 'Basavanagudi', '358794615','Graphic Designer', 'Design', 60000, '2021-09-25', 108, 'Building C' ),"
				+ "(110,'arjun', 'arjun@gmail.com', 'arjun@123', 'BTM Layout', '3245698718', 'Network Engineer', 'IT', 75000, '2020-10-30', 109, 'Building A' ),"
				+ "(111,'reem', 'reem@gmail.com', 'reem@123', 'HSR Layout', '3597846158','Content Writer', 'Marketing', 55000, '2019-11-05', 110, 'Building B'),"
				+ "(112,'nia', 'nia@gmail.com', 'nia@123', 'Marathahalli', '3245698745','System Administrator', 'IT', 80000, '2018-12-10', 111, 'Building C' ),"
				+ "(113,'karan', 'karan@gmail.com', 'karan@133', 'Banashankari', '325648791', 'Legal Advisor', 'Legal', 95000, '2017-01-15', 112, 'Building A')," 
				+ "(114,'teju', 'teju@gmail.com', 'teju@123', 'Yelahanka', '5478963214','Research Scientist', 'R&D', 120000, '2016-02-20', 113, 'Building B' ),"
				+ "(115,'rahul', 'rahul@gmail.com', 'rahul@123', 'Electronic City', '7894566555', 'Product Manager', 'Product', 110000, '2015-03-25', 114, 'Building C')," 
				+ "(116,'kiran', 'kiran@gmail.com', 'kiran@123', 'Bellandur', '5455887565','Operations Manager', 'Operations', 95000, '2022-04-30', 115, 'Building A' ),"
				+ "(117,'mahesh', 'mahesh@gmail.com', 'mahesh@123', 'Frazer Town', '6554895115','Compliance Officer', 'Compliance', 85000, '2021-05-05', 116, 'Building B')," 
				+ "(118,'kavya', 'kavya@gmail.com', 'kavya@132', 'Kalyan Nagar', '8794561335','IT Support Specialist', 'IT', 65000, '2020-06-10', 117, 'Building C' )," 
				+ "(119,'tafseen', 'tafseen@gmail.com', 'tafseen@123', 'Richmond Town', '9874623235','Financial Advisor', 'Finance', 95000, '2019-07-15', 118, 'Building A' )," 
				+ "(120,'usha', 'usha@gmail.com', 'usha@123', 'Sadashivanagar', '7895222141','Architect', 'Architecture', 90000, '2018-08-20', 119, 'Building B' )";
			
		

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
