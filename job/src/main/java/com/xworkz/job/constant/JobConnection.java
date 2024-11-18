package com.xworkz.job.constant;

public enum JobConnection {
	URL("jdbc:mysql://localhost:3306/job"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private JobConnection(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
