package com.xworkz.things.food.runner;

public class LollipopRunner {

	public static void main(String[] args) {
		try{
			Class.forName("com.xworkz.things.food.Lollipop");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} 
		catch(ClassNotFoundException e) {
             e.printStackTrace();
	}

}
}
