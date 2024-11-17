package com.xworkz.signIn.service;

import com.xworkz.signIn.dto.SignInDTO;
import com.xworkz.signIn.repository.SignInRepoImpl;

public class SignInServiceImpl implements SignInService {

	@Override
	public boolean save(SignInDTO dto) {
		boolean isValid=true;
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAddress());
		System.out.println(dto.getBusinessName());
		System.out.println(dto.getMessage());
		
		if(isValid) {
		SignInRepoImpl repo=new SignInRepoImpl();
		boolean change=repo.save(dto);
		}
		
		return false;
	}

}
