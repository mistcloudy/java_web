<%@ page language="java"   contentType="text/html; charset=UTF-8"
     import="java.util.*, sec01.ex01.*" 
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
%>    
<jsp:useBean  id="m"  class="sec01.ex01.MemberBean"  scope="page"/>
<jsp:setProperty name="m" property="*" />

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>members list</title>
</head>
<body>
  <table align="center"  width="100%">
	 <tr align="center" bgcolor="#99ccff">
	      <td width="7%" >id</td>
	      <td width="7%">pwd</td>
	      <td width="5%" >name</td>
	      <td width="11%" >email</td>
	      <td width="5%" >joindate</td>
	   </tr>
	   <tr align="center">
	  <td> <jsp:getProperty name="m"  property="id"  /> </td>
          <td> <jsp:getProperty name="m"  property="pwd"  />  </td>
          <td> <jsp:getProperty name="m"  property="name"     /> </td>
          <td> <jsp:getProperty name="m"  property="email"  /> </td>
	   </tr>
	   <tr height="1" bgcolor="#99ccff">
	      <td colspan="5"></td>
	   </tr>
	</table>
</body>
</html>