<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 결과</title>
</head>
<body>
	<%-- 비밀번호/확인이 일치하지 않는 경우
        -> 비밀번호가 일치하지 않습니다.

        비밀번호/확인이 일치하는 경우
        아이디 : user01
        비밀번호 : pass01
        이름 : 유저일 
        이메일 : user01@gmail.com
        취미 : 게임 영화 코딩 

        유저일의 회원가입이 완료되었습니다. 
     --%>

    <%
        String memberId=request.getParameter("memberId");
        String []memberPw=request.getParameterValues("memberPw");
        String memberName=request.getParameter("memberName");
        String memberEmail=request.getParameter("memberEmail");
        String []hobby=request.getParameterValues("hobby");
    %>

    <%-- 비밀번호 불일치 --%>
    <% if(!memberPw[0].equals(memberPw[1])){ %>
        <h3>비밀번호가 일치하지 않습니다. </h3>
    <% }else{ %>

        <ul>
            <li>아이디 : <%= memberId %> </li>
            <li>비밀번호 : <%= memberPw[0] %></li>
            <li>이름 : <%= memberName %></li>
            <li>이메일 : <%= memberEmail %></li>
            <li>취미 : 
            <% for(String s:hobby){  %>
              <%= s %>   <% } %> </li>
            
        </ul>
       
     <% } %>

     <h3><%= memberName %> 님의 회원가입이 완료되었습니다. </h3>

    

</body>
</html>