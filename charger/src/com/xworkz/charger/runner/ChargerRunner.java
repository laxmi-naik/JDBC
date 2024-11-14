package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.charger.enumerate.ChargerEnum;

public class ChargerRunner {

	public static void main(String[] args) {

		PreparedStatement prepared=null;
		try(Connection connection=DriverManager.getConnection(ChargerEnum.URL.getValue(), ChargerEnum.USERNAME.getValue(), ChargerEnum.PASSWORD.getValue()))
		{
			
			prepared=connection.prepareStatement("insert into charger_table values(?,?)");
			prepared.setInt(1, 1);
			prepared.setString(2, "25");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 2);
			prepared.setString(2, "30");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 3);
			prepared.setString(2, "41");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 4);
			prepared.setString(2, "35");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 5);
			prepared.setString(2, "70");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 6);
			prepared.setString(2, "80");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 7);
			prepared.setString(2, "90");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 8);
			prepared.setString(2, "50");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 9);
			prepared.setString(2, "35");
			prepared.executeUpdate();
		    
			prepared.setInt(1, 10);
			prepared.setString(2, "40");
			prepared.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
 }


