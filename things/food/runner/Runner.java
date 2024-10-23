package com.xworkz.things.food.runner;

public class Runner {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("running driver");
		} 
		catch(ClassNotFoundException e) {
             e.printStackTrace();
	}

	}

}
