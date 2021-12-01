<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"
isELIgnored="false"  %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>login window</title>
</head>
<body>
   <form action="result.jsp">
	   id : <input type="text" size=20 /><br>
	   pwd : <input  type="password"  size=20 /><br>
	   <input  type="submit" value="login" /> <input type="reset" value="reinput"  />
   </form> 
   <br><br>
   <a href="${pageContext.request.contextPath}/test01/memberForm.jsp">join</a>   
</body>
</html>