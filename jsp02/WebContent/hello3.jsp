<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
   String name = "lee sun sin";
   public String getName(){ return name;}
%>  
<% String age=request.getParameter("age"); %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Expression tag practice</title>
</head>
<body>
    <h1>Hello <%=name %>!!</h1>
    <h1>age is <%=age %>!!</h1>
    <h1>height is <%=180 %>!!</h1>
    <h1>age+10 is <%=Integer.parseInt(age)+10 %>!!</h1>
</body>
</html>