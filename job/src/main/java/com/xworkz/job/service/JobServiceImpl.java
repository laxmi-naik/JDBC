package com.xworkz.job.service;
import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.repository.JobRepoImpl;

public class JobServiceImpl implements JobService {

	@Override
	public boolean save(JobDTO dto) {
		boolean isValid=true;
		
		if(dto!=null) {
			String name=dto.getName();
			if(name!=null && !name.isEmpty()&&name.length()>6&&name.length()<14) {
				System.out.println("Name is valid");
				
			}
			else {
				isValid=false;
				System.out.println("Name is invalid");
			}
			long phoneno1=dto.getPhoneno();
		    String phoneNumber = String.valueOf(phoneno1);
			if(phoneNumber.length()==10 && phoneNumber.startsWith("9")) {
				System.out.println("phoneNo is valid");
			}
			else {
				isValid=false;
				System.out.println("phoneNo is in valid");
			}
				String email=dto.getEmail();
			if (email != null && !email.isEmpty() && (email.endsWith("@gmail.com")) && email.indexOf('@')==7 && Character.isUpperCase(email.charAt(0))) {
				System.out.println("email is valid");
			}
			else {
				isValid=false;
				System.out.println("email is in valid");
			}
			int age1=dto.getAge();
			if(age1!=0&& age1>5 && age1<30) {
				System.out.println("age is valid");
			}
			else {
				isValid=false;
				System.out.println("age is in-valid");
				
			}
		}
		
		if(isValid) {
			System.out.println("save data in to database");
			JobRepoImpl rep=new JobRepoImpl();
			boolean  ref=rep.save(dto);
			System.out.println(ref);
			
		}
		return isValid;
	}

}
