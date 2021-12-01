<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
   String id=request.getParameter("id");
   String pwd=request.getParameter("pwd");
   String name= request.getParameter("name");
   String email= request.getParameter("email");
  
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
      <td><%=id %> </td>
      <td><%=pwd%> </td>
      <td><%=name %> </td>
      <td><%=email %> </td>
   </tr>   
   <tr align=center>
      <td>${param.id } </td>
      <td>${param.pwd } </td>
      <td>${param.name } </td>
      <td>${param.email }</td>
   </tr>
</table>
</body>
</html>