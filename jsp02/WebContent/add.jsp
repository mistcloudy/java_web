<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  
    errorPage="addException.jsp" %> 
<% 
   int num = Integer.parseInt(request.getParameter("num"));
   int sum=0;
   for(int i =1 ; i<= num ; i++){
      sum = sum + i;
   }
%>

<!DOCTYPE html>          
<html>
<head>
    <title>Find the total number</title>
</head>
<body>
<h2>Find the total number</h2>
<h1>1 sum up to <%=num  %> is <%=sum  %> </h1>
</body>
</html>