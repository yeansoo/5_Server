<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과 페이지</title>
<style>
	h1{
		background-color:pink;
		color:white;
	}
</style>
</head>
<body>
	<h1>로그인 결과</h1>
	
	<!-- jsp에서 자바코드의 값을 출력하는 방법 -->
	<%= request.getParameter("inputId") %>
	<br>
	<%= request.getParameter("inputPw") %>
	
	<!-- 자바 코드 작성 영역 -->
	<% 
		// 자바 주석 가능 == 자바 코드 작성 영역  
		// request.getAttribute("key") -> value 
		String res=(String)request.getAttribute("r"); 
						// -> 다운캐스팅 필요 
						
		String color=(String)request.getAttribute("color"); 
	%>
	<h3 style='color: green ;'> <%= res %> </h3>
	
	<button type='button' onclick='history.back()'>돌아가기</button>
</body>
</html>