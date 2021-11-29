<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  request.setCharacterEncoding("utf-8");
  int score=Integer.parseInt(request.getParameter("score"));
%> 

<!DOCTYPE html>
<html>
<head>
<title>Score output window</title>
<meta charset="UTF-8">
</head>
<body>
<h1>Test Score  <%=score %></h1><br>
<%
 if(score>=90){
%>
   <h1>A.</h1>
<%
 }else if(score>=80 && score<90){
%>
    <h1> B.</h1>
<%
   }else if(score>=70 && score<80){
%>
   <h1> C.</h1>
<%
   }else if(score>=60 && score<70){
%>
   <h1> D.</h1>
<%
   }else{
%>
   <h1> F.</h1>
<%
   }
%>
<br>
<a href="scoreTest.html">Test Score Input</a>
</body>
</html>