package com.xworkz.signIn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signIn.dto.SignInDTO;
import com.xworkz.signIn.service.SignInServiceImpl;


@WebServlet(name = "SignServlet", urlPatterns = { "/SignServlet" })
public class SignInServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String businessName=request.getParameter("businessName");
		String message=request.getParameter("message");
		
		
		SignInDTO dto=new SignInDTO(name, email, address, businessName, message);
		SignInServiceImpl imp=new SignInServiceImpl();
		imp.save(dto);
	}

}
