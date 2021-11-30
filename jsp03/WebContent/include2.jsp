<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");
%> 

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>include2.jsp</title>
</head>
<body>
  Hello tanuki JSP Start part!!!
<br>
<jsp:include  page="tanuki_image.jsp"  flush="true" >
   <jsp:param name="name"  value="tanuki2"/>
   <jsp:param name="imgName"  value="tanuki2.jpg"/>
</jsp:include>
<br>
  Hello tanuki JSP End part!!!
</body>
</html>