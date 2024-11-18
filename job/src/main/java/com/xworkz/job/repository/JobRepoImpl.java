package com.xworkz.job.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.job.constant.JobConnection;
import com.xworkz.job.dto.JobDTO;


public class JobRepoImpl  implements JobRepo{

	@Override
	public boolean save(JobDTO dto) {
		boolean valid=true;
		Connection connection=null;
		PreparedStatement prepared=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			
		connection=DriverManager.getConnection(JobConnection.URL.getValue(),JobConnection.USERNAME.getValue(),JobConnection.PASSWORD.getValue());
		prepared=connection.prepareStatement("insert into job_table values(?,?,?,?,?,?)");
		prepared.setString(1, dto.getName());
		prepared.setLong(2, dto.getPhoneno());
		prepared.setString(3, dto.getEmail());
		prepared.setInt(4, dto.getAge());
		prepared.setInt(5, dto.getExperience());
		prepared.setString(6, dto.getAddress());
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
