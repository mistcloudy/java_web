<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, sec01.ex01.*" pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
  
%>   
<jsp:useBean  id="m" class="sec01.ex01.MemberBean" />
<jsp:setProperty  name="m" property="*" />

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
   
  <tr align="center">
       <td><%=m.getId() %> </td>
       <td><%=m.getPwd() %></td>
       <td><%=m.getName() %></td>
       <td><%=m.getEmail() %></td>
</tr>
     <tr align="center">
       <td>${m.id } </td>
       <td>${m.pwd} </td>
       <td>${m.name }</td>
       <td>${m.email }</td>
</tr>
</body>
</html>