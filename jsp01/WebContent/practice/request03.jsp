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
<title>EL �Լ� ȣ��</title>
</head>
<body>
������ <b>${elfunc:dateFormat(today)}</b> �Դϴ�.
</body>
</html>