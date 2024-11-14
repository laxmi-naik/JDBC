package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.books.Dto.BookDTO;
import com.xworkz.books.enumerate.EnumBook;

public class BookRunner {
	

public static void main(String[] args) {
		
	BookDTO dto1=new BookDTO(1, "Laxmi", "laxmi@gmail.com", "laxmi@123", "BTM", 9844312496l, "The Great Gatsby", "F Scott Fitzgerald", "Classic", "2024-04-12");
	BookDTO dto2=new BookDTO(2, "Bhavya", "bhavya@gmail.com", "bhavya@123", "Rajaji Nagar", 4569874556l, "To Kill a Mockingbird", "Harper Lee", "Fiction", "2024-07-11");
	BookDTO dto3=new BookDTO(3, "Swati", "swati@gmail.com", "swati@123", "HSR Layout", 5446464412l,"Pride and Prejudice", "Jane Austen", "Romance", "2024-02-15");
	BookDTO dto4=new BookDTO(4, "Anu", "anu@gmail.com", "anu@123", "Marathahalli", 584692133l, "1984", "George Orwell", "Dystopian","2024-03-15");
	BookDTO dto5=new BookDTO(5, "Samarth", "samarth@gmail.com", "samarth@123", "Electronic City", 125478966l,"Moby Dick", "Herman Melville", "Adventure","2024-05-17" );
	BookDTO dto6=new BookDTO(6, "Chanagond", "chanagond@gmail.com", "chanagond@123", "M G Road", 654789133l,"The Catcher in the Rye", "J.D. Salinger", "Fiction", "2024-08-05");
	BookDTO dto7=new BookDTO(7, "Lalitha", "lalitha@gmail.com", "lalitha@123", "K R Market", 9874563215l,"War and Peace", "Leo Tolstoy", "Historical","2024-12-12");
	BookDTO dto8=new BookDTO(8, "Kavya", "kavya@gmail.com", "kavya@123", "Malleshwaram", 654789123l,"The Hobbit", "J.R.R. Tolkien","Fantasy","2024-10-10" );
	BookDTO dto9=new BookDTO(9, "Kiran", "kiran@gmail.com", "kiran@123", "Jayanagar", 6987546123l,"The Picture of Dorian Gray", "Oscar Wilde", "Philosophical","2024-09-05");
	BookDTO dto10=new BookDTO(10, "Soni", "soni@gmail.com", "soni@123", "Whitefield", 9874562135l,"Brave New World", "Aldous Huxley", "Science Fiction","2024-04-06" );
	    Connection connection=null;
		PreparedStatement prepared=null;
		try
		{
			 connection=DriverManager.getConnection(EnumBook.URL.getValue(), EnumBook.USERNAME.getValue(), EnumBook.PASSWORD.getValue());
			prepared=connection.prepareStatement("insert into books_table values(?,?,?,?,?,?,?,?,?,?)");
			
			prepared.setInt(1, dto1.getId());
			prepared.setString(2,dto1.getName());
			prepared.setString(3,dto1.getEmail());
			prepared.setString(4,dto1.getPassword());
			prepared.setString(5,dto1.getAddress());
			prepared.setLong(6,dto1.getPhoneNo());
			prepared.setString(7,dto1.getTitle());
			prepared.setString(8,dto1.getAuthor());
			prepared.setString(9,dto1.getGenre());
			prepared.setString(10,dto1.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto2.getId());
			prepared.setString(2,dto2.getName());
			prepared.setString(3,dto2.getEmail());
			prepared.setString(4,dto2.getPassword());
			prepared.setString(5,dto2.getAddress());
			prepared.setLong(6,dto2.getPhoneNo());
			prepared.setString(7,dto2.getTitle());
			prepared.setString(8,dto2.getAuthor());
			prepared.setString(9,dto2.getGenre());
			prepared.setString(10,dto2.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto3.getId());
			prepared.setString(2,dto3.getName());
			prepared.setString(3,dto3.getEmail());
			prepared.setString(4,dto3.getPassword());
			prepared.setString(5,dto3.getAddress());
			prepared.setLong(6,dto3.getPhoneNo());
			prepared.setString(7,dto3.getTitle());
			prepared.setString(8,dto3.getAuthor());
			prepared.setString(9,dto3.getGenre());
			prepared.setString(10,dto3.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto4.getId());
			prepared.setString(2,dto4.getName());
			prepared.setString(3,dto4.getEmail());
			prepared.setString(4,dto4.getPassword());
			prepared.setString(5,dto4.getAddress());
			prepared.setLong(6,dto4.getPhoneNo());
			prepared.setString(7,dto4.getTitle());
			prepared.setString(8,dto4.getAuthor());
			prepared.setString(9,dto4.getGenre());
			prepared.setString(10,dto4.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto5.getId());
			prepared.setString(2,dto5.getName());
			prepared.setString(3,dto5.getEmail());
			prepared.setString(4,dto5.getPassword());
			prepared.setString(5,dto5.getAddress());
			prepared.setLong(6,dto5.getPhoneNo());
			prepared.setString(7,dto5.getTitle());
			prepared.setString(8,dto5.getAuthor());
			prepared.setString(9,dto5.getGenre());
			prepared.setString(10,dto5.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto6.getId());
			prepared.setString(2,dto6.getName());
			prepared.setString(3,dto6.getEmail());
			prepared.setString(4,dto6.getPassword());
			prepared.setString(5,dto6.getAddress());
			prepared.setLong(6,dto6.getPhoneNo());
			prepared.setString(7,dto6.getTitle());
			prepared.setString(8,dto6.getAuthor());
			prepared.setString(9,dto6.getGenre());
			prepared.setString(10,dto6.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto7.getId());
			prepared.setString(2,dto7.getName());
			prepared.setString(3,dto7.getEmail());
			prepared.setString(4,dto7.getPassword());
			prepared.setString(5,dto7.getAddress());
			prepared.setLong(6,dto7.getPhoneNo());
			prepared.setString(7,dto7.getTitle());
			prepared.setString(8,dto7.getAuthor());
			prepared.setString(9,dto7.getGenre());
			prepared.setString(10,dto7.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto8.getId());
			prepared.setString(2,dto8.getName());
			prepared.setString(3,dto8.getEmail());
			prepared.setString(4,dto8.getPassword());
			prepared.setString(5,dto8.getAddress());
			prepared.setLong(6,dto8.getPhoneNo());
			prepared.setString(7,dto8.getTitle());
			prepared.setString(8,dto8.getAuthor());
			prepared.setString(9,dto8.getGenre());
			prepared.setString(10,dto8.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto9.getId());
			prepared.setString(2,dto9.getName());
			prepared.setString(3,dto9.getEmail());
			prepared.setString(4,dto9.getPassword());
			prepared.setString(5,dto9.getAddress());
			prepared.setLong(6,dto9.getPhoneNo());
			prepared.setString(7,dto9.getTitle());
			prepared.setString(8,dto9.getAuthor());
			prepared.setString(9,dto9.getGenre());
			prepared.setString(10,dto9.getPublish_date());
			prepared.executeUpdate();
			
			prepared.setInt(1, dto10.getId());
			prepared.setString(2,dto10.getName());
			prepared.setString(3,dto10.getEmail());
			prepared.setString(4,dto10.getPassword());
			prepared.setString(5,dto10.getAddress());
			prepared.setLong(6,dto10.getPhoneNo());
			prepared.setString(7,dto10.getTitle());
			prepared.setString(8,dto10.getAuthor());
			prepared.setString(9,dto10.getGenre());
			prepared.setString(10,dto10.getPublish_date());
			prepared.executeUpdate();
			
			
			     
			
        }
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
     }
}
