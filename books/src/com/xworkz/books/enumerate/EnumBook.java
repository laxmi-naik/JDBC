package com.xworkz.books.enumerate;

public enum EnumBook {
	URL("jdbc:mysql://localhost:3306/books"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private EnumBook(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
