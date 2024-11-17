package com.xworkz.signIn.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.signIn.constant.SignInConnection;
import com.xworkz.signIn.dto.SignInDTO;

public class SignInRepoImpl implements SignInRepo {

	@Override
	public boolean save(SignInDTO dto) {
		boolean valid=false;
		Connection connection=null;
		PreparedStatement prepared=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			
		connection=DriverManager.getConnection(SignInConnection.URL.getValue(),SignInConnection.USERNAME.getValue(),SignInConnection.PASSWORD.getValue());
		prepared=connection.prepareStatement("insert into sign_table(name, email, address, businessName, message) values(?,?,?,?,?)");
		prepared.setString(1, dto.getName());
		prepared.setString(2, dto.getEmail());
		prepared.setString(3, dto.getAddress());
		prepared.setString(4, dto.getBusinessName());
		prepared.setString(5, dto.getMessage());
		 int ref=prepared.executeUpdate();
		 if(ref>0) {
				valid=true;
				System.out.println("data is saved");
			}
			else {
				valid=false;
				System.err.println("data is not saved");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}

}
