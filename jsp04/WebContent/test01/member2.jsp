<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
  
%>   
<html>
<head>
<meta charset=”UTF-8">
<title>members list</title>
</head>
<body>
<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
      <td width="20%" >id</td>
	      <td width="20%">pwd</td>
	      <td width="20%" >name</td>
	      <td width="20%" >email</td>
   </tr>

   <tr align=center>
      <td>${param.id } </td>
      <td>${param.pwd } </td>
      <td>${param.name } </td>
      <td>${param.email }</td>
      <td>${requestScope.address}</td>
   </tr>
</table>
</body>
</html>