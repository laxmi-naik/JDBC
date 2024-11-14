package com.xworkz.charger.enumerate;

public enum ChargerEnum {
	URL("jdbc:mysql://localhost:3306/charger"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private ChargerEnum(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
