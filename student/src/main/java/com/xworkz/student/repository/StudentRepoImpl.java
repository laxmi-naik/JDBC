package com.xworkz.student.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.xworkz.student.constant.StudentEnum;
import com.xworkz.student.dto.StudentDTO;

public class StudentRepoImpl implements StudentRepo{

	@Override
	public boolean update(StudentDTO dto) {
		boolean valid=false;
		Connection connection=null;
		PreparedStatement prepared=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try
		{
			
			connection=DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(), StudentEnum.PASSWORD.getValue());
			prepared=connection.prepareStatement("insert into student_table values(?,?,?,?,?,?)");
			prepared.setString(1, dto.getName());
			prepared.setString(2, dto.getEmail());
			prepared.setString(3, dto.getPassword());
			prepared.setString(4, dto.getConfirmPassword());
			prepared.setString(5, dto.getContactNo());
			prepared.setString(6, dto.getAddress());
			int ref=prepared.executeUpdate();
			if(ref>0) {
				valid=true;
				System.out.println("data is saved");
			}
			else {
				valid=false;
				System.out.println("data is not saved");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return valid;
	}

}
