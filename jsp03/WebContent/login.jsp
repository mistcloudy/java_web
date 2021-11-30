<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");
%> 


<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login window</title>
</head>
<body>
<%
  String msg = request.getParameter("msg");
  if(msg != null){
%>
   <h1><%=msg %>  </h1>
<%
  }
%>

   <form   action="result.jsp"  method="post">
       id:  <input type="text"  name="userID"><br>
       password:  <input type="password"  name="userPw"><br>
      <input type="submit"  value="login">
      <input type="reset"  value="re-input">
   </form>
</body>
</html>