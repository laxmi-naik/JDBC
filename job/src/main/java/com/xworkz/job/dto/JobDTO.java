package com.xworkz.job.dto;

public class JobDTO {
private String name;
private long phoneno;
private String email;
private int age;
private int experience;
private String address;
public JobDTO(String name, long phoneno, String email, int age, int experience, String address) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.email = email;
	this.age = age;
	this.experience = experience;
	this.address = address;
}
@Override
public String toString() {
	return "JobDTO [name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", age=" + age + ", experience="
			+ experience + ", address=" + address + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + age;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + experience;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (int) (phoneno ^ (phoneno >>> 32));
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
	JobDTO other = (JobDTO) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (age != other.age)
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (experience != other.experience)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (phoneno != other.phoneno)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
