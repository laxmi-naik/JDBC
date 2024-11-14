package com.xworkz.books.Dto;

public class BookDTO {
 private int id;
 private String name;
 private String email;
 private String password;
 private String address;
 private long phoneNo;
 private String title;
 private String author;
 private  String genre;
 private String publish_date;
public BookDTO(int id, String name, String email, String password, String address, long phoneNo, String title,
		String author, String genre, String publish_date) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
	this.phoneNo = phoneNo;
	this.title = title;
	this.author = author;
	this.genre = genre;
	this.publish_date = publish_date;
}
@Override
public String toString() {
	return "BookDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
			+ address + ", phoneNo=" + phoneNo + ", title=" + title + ", author=" + author + ", genre=" + genre
			+ ", publish_date=" + publish_date + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((genre == null) ? 0 : genre.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
	result = prime * result + ((publish_date == null) ? 0 : publish_date.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BookDTO other = (BookDTO) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (genre == null) {
		if (other.genre != null)
			return false;
	} else if (!genre.equals(other.genre))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (phoneNo != other.phoneNo)
		return false;
	if (publish_date == null) {
		if (other.publish_date != null)
			return false;
	} else if (!publish_date.equals(other.publish_date))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getPublish_date() {
	return publish_date;
}
public void setPublish_date(String publish_date) {
	this.publish_date = publish_date;
}

 
}
