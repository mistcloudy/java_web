<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, sec01.ex01.*" pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
  
%>   
<jsp:useBean  id="m" class="sec01.ex02.MemberBean" />
<jsp:setProperty  name="m" property="*" />
<jsp:useBean   id="addr" class="sec01.ex02.Address"/>
<jsp:setProperty   name="addr" property="city" value="seoul"/>
<jsp:setProperty   name="addr" property="zipcode" value="07654"/>
<%
  m.setAddr(addr);
%> 
<html>
<head>
<meta charset=”UTF-8">
<title>members list</title>
</head>
<body>
<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
      <td width="7%" >id</td>
	      <td width="7%">pwd</td>
	      <td width="5%" >name</td>
	      <td width="5%" >email</td>
	       <td width="5%" >city</td>
	      <td width="5%" >zipcode</td>
   </tr>
 <tr align="center">
      <td>${m.id } </td>
      <td>${m.pwd } </td>
      <td>${m.name } </td>
      <td>${m.email}</td>
      <td><%=m.getAddr().getCity() %></td>
      <td><%=m.getAddr().getZipcode() %></td>   
   </tr>
   <tr align="center">
      <td>${m.id } </td>
      <td>${m.pwd } </td>
      <td>${m.name} </td>
      <td>${m.email}</td>
	<td>${m.addr.city}</td>
      <td>${m.addr.zipcode}</td>
   </tr>
</body>
</html>