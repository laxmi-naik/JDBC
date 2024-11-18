package com.xworkz.job.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.service.JobServiceImpl;
@WebServlet("/apply")
public class JobServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String phoneno=req.getParameter("phoneno");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String experience=req.getParameter("experience");
		String address=req.getParameter("address");
		
		long phoneno1=Long.valueOf(phoneno);
		int age1=Integer.valueOf(age);
		int experience1=Integer.valueOf(experience);
		
		JobServiceImpl imp=new JobServiceImpl();
		JobDTO dto=new JobDTO(name, phoneno1, email, age1, experience1, address);
		boolean ref=imp.save(dto);
		if(ref) {
			System.out.println("is saved");
			req.setAttribute("saved", "data is saved");
		}
		else {
			System.out.println("is not saved");
			req.setAttribute("isnotsaved", "data is not saved");
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(req, resp);
	}



}
