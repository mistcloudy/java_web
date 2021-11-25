<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Result output window</title>
</head>
<body>
   <h1>Result output</h1>
   <%
      request.setCharacterEncoding("utf-8");
      String user_id=request.getParameter("user_id");
      String user_pw=request.getParameter("user_pw");
   %>	
    <h1>id  : <%= user_id %></h1>
    <h1>password: <%= user_pw %></h1>
</body>
</html>