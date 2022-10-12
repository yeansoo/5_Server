package edu.kh.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		
		// JSP 요청 위임 객체 (JSP 경로 지정)
		RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/views/SignUpResult.jsp");
			
		
		// req, resp 객체 JSP로 위임
		dispatcher.forward(req, resp);
	}

}
