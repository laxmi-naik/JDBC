package com.xworkz.things.food.runner;

import com.xworkz.things.food.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		
		
		try{
			Class.forName("com.xworkz.things.food.Dosa");
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
            e.printStackTrace();
	}
		
		Dosa.print();
	}

}
