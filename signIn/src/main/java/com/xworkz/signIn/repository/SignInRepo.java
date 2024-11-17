package com.xworkz.signIn.repository;

import com.xworkz.signIn.dto.SignInDTO;

public interface SignInRepo {
 boolean save(SignInDTO dto);
}
