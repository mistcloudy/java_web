<%@page import="java.util.TimeZone"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>time Zone</title>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date() %>"></c:set>

Korea KST :
<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br><br>

UK GMT :
<fmt:timeZone value="GMT">
<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>

</fmt:timeZone>
<br><br>

<%
String[] ids = java.util.TimeZone.getAvailableIDs();

for(int i=0; i<ids.length; i++) {
	out.println(ids[i]+"<br>");
}
%>
</body>
</html>