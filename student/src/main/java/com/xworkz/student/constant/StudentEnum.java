package com.xworkz.student.constant;

public enum StudentEnum {
	
	
	URL("jdbc:mysql://localhost:3306/students"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private  final String value;
	private StudentEnum(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
}
