package com.xworkz.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.service.StudentServiceImpl;
@WebServlet(loadOnStartup=1,urlPatterns="/Apply")
public class StudentServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		String contactNo=req.getParameter("contactNo");
		String address=req.getParameter("address");
		
		StudentDTO dto = new StudentDTO(name, email, password, confirmPassword, contactNo, address);
		StudentServiceImpl ref = new StudentServiceImpl(); 
		 ref.save(dto);
		
		
	}
}
