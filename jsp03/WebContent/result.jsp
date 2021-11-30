<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   request.setCharacterEncoding("utf-8");
%> 
<%!
  String msg = "You didn't enter your ID. Please enter your account.";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>result window</title>
</head>
<body>
<%
   String userID = request.getParameter("userID" );
   if(userID.length()==0){
%>
     <jsp:forward  page="login.jsp" >		
      <jsp:param name="msg" value="<%= msg %>" />
   </jsp:forward>
<%	
  }
%>
  <h1>welcome   <%= userID %>!! </h1>
</body>
</html>