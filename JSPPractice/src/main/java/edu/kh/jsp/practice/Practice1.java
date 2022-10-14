package edu.kh.jsp.practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1 extends HttpServlet{
/*
 	서블릿 시작하기 
 	1. Dynamic web project 으로 새파일 만들기 
 	2. webapp 안에 html 파일 작성 
 	3. 서버추가-프로젝트 연결 
 	4. html 작성, html에서 java로 서비스를 요청 이때 html에서 따로 method를 지정하지 않으면 get
 	5. method에 맞는 do- 함수 추가 
 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("서버연결~");
		
		//String input=req.getParameter("input1");
	}
	
	
	
}
