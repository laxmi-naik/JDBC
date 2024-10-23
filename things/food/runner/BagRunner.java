package com.xworkz.things.food.runner;

public class BagRunner {

	public static void main(String[] args) {
        try{
        	Class.forName("com.xworkz.things.food.Bag");
        	Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
	}

	}

}
