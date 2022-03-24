<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Date" %>
    <%@ page session="true" %>
    <%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/el-functions.tld" %>
    
    <%
     Date today = new Date();
     request.setAttribute("today", today);
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL 함수 호출</title>
</head>
<body>
오늘은 <b>${elfunc:dateFormat(today)}</b> 입니다.
</body>
</html>