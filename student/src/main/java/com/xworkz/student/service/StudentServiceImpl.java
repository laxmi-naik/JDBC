package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.repository.StudentRepoImpl;

public class StudentServiceImpl  implements StudentService{

	@Override
	public boolean save(StudentDTO dto) {
		boolean isValid=true;
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());
		System.out.println(dto.getConfirmPassword());
		System.out.println(dto.getContactNo());
		System.out.println(dto.getAddress());
		if(isValid) {
		StudentRepoImpl imp=new StudentRepoImpl();
		boolean pk=imp.update(dto);
		}
		
		return false;
	}

}
