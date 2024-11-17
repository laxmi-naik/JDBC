package com.xworkz.signIn.constant;

public enum SignInConnection {

	URL("jdbc:mysql://localhost:3306/sign"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private SignInConnection(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	
}
