package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.vo.Person;

@WebServlet("/forEach")
public class ForEachServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Person> pList=new ArrayList<>();
		
		pList.add(new Person("홍길동", 35, "서울시 중구"));
		pList.add(new Person("김길동", 25, "서울시 종로구"));
		pList.add(new Person("이길동", 36, "서울시 문방구"));
		pList.add(new Person("왕길동", 11, "서울시 성동구"));
		pList.add(new Person("박길동", 22, "서울시 야구"));
		
		req.setAttribute("pList", pList); // request에 값 세팅
		
		
		// 요청 위임
		RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/views/forEach.jsp");
		
		dispatcher.forward(req, resp);
	}
	
}
