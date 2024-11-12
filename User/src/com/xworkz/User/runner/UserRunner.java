package com.xworkz.User.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/user";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into user_table(id,name, email, password, address, phone_no, age, gender, signup_date, last_login,profile_description, status) values "
				+ "(101,'laxmi', 'laxmi@gmail.com', 'laxmi@123', 'rajaji nagar', '9844312496', 25, 'Female', '2023-01-01', '2023-11-01','Software Developer', 'Active')," 
				+ "(102,'bhavya', 'bhavya@gmail.com', 'bhavya@123', 'Koramangala', '444544445', 30, 'Female', '2023-01-02', '2023-11-02','Digital Marketing Specialist ','Active' ),"
				+ "(103,'swati', 'swati@gmail.com', 'swati@123', 'Whitefield', '2545445454', 27, 'Female', '2023-01-03', '2023-11-03','HR Manager','Active' )," 
				+ "(104,'anu', 'anu@gmail.com', 'anu@123', 'M.G. Road', '211113344', 22, 'Female', '2023-01-04', '2023-11-04',' Business Analyst','Inactive')," 
				+ "(105,'samarth', 'samarth@gmail.com', 'samarth@123', 'Indiranagar', '1555789546', 35, 'Male', '2023-01-05', '2023-11-05',' Content Writer','Active' ),"
				+ "(106,'chanagond', 'chanagond@gmail.com', 'chanagond@123', 'Jayanagar', '324569874', 28, 'Male', '2023-01-06', '2023-11-06',' Financial Analyst','Inactive'),"
				+ "(107,'lalitha', 'lalitha@gmail.com', 'lalitha@123', 'Hebbal', '1254789635', 24, 'Female', '2023-01-07', '2023-11-07','Sales Manager ','Active')," 
				+ "(108,'soni', 'soni@gmail.com', 'soni@123', 'Malleshwaram', '359874561', 32, 'Female', '2023-01-08', '2023-11-08','Travel Enthusiast ','Inactive')," 
				+ "(109,'aly', 'aly@gmail.com', 'aly@123', 'Basavanagudi', '358794615', 29, 'Male', '2023-01-09', '2023-11-09',' Fitness Coach','Active'),"
				+ "(110,'arjun', 'arjun@gmail.com', 'arjun@123', 'BTM Layout', '3245698718', 31, 'male', '2023-01-10', '2023-11-10','Food Blogger ','Inactive'),"
				+ "(111,'reem', 'reem@gmail.com', 'reem@123', 'HSR Layout', '3597846158', 26, 'female', '2023-01-11', '2023-11-11', 'Photographer','Active'),"
				+ "(112,'nia', 'nia@gmail.com', 'nia@123', 'Marathahalli', '3245698745', 34, 'Female', '2023-01-12', '2023-11-12', 'Musician','Active'),"
				+ "(113,'karan', 'karan@gmail.com', 'karan@133', 'Banashankari', '325648791', 23, 'Male', '2023-01-13', '2023-11-13',' Pet Lover','Inactive')," 
				+ "(114,'teju', 'teju@gmail.com', 'teju@123', 'Yelahanka', '5478963214', 36, 'Female', '2023-01-14', '2023-11-14',' Artist','Active'),"
				+ "(115,'rahul', 'rahul@gmail.com', 'rahul@123', 'Electronic City', '7894566555', 28, 'Male', '2023-01-15', '2023-11-15',' Gardener','Inactive')," 
				+ "(116,'kiran', 'kiran@gmail.com', 'kiran@123', 'Bellandur', '5455887565', 30, 'male', '2023-01-16', '2023-11-16','Bookworm ','Active'),"
				+ "(117,'mahesh', 'mahesh@gmail.com', 'mahesh@123', 'Frazer Town', '6554895115', 27, 'Male', '2023-01-17', '2023-11-17','Yoga Instructor ','Inactive')," 
				+ "(118,'kavya', 'kavya@gmail.com', 'kavya@132', 'Kalyan Nagar', '8794561335', 33, 'Female', '2023-01-18', '2023-11-18','Graphic Designer ','Active')," 
				+ "(119,'tafseen', 'tafseen@gmail.com', 'tafseen@123', 'Richmond Town', '9874623235', 26, 'female', '2023-01-19', '2023-11-19','Project Manager ','Inactive')," 
				+ "(120,'usha', 'usha@gmail.com', 'usha@123', 'Sadashivanagar', '7895222141', 35, 'Female', '2023-01-20', '2023-11-20',' Data Scientist','Active')";
			
		

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
