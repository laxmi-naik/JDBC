package com.xworkz.things.food.runner;

public class PhoneRunner {

	public static void main(String[] args) {
		try{
			Class.forName("com.xworkz.things.food.Phone");
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
            e.printStackTrace();
	}

	}

}
