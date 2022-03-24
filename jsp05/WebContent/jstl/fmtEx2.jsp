<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>formatNumber, formatDate</title>
</head>
<body>

Number :
<fmt:formatNumber value="12345.678" type= "number"></fmt:formatNumber><br><br>

Currency:
<fmt:formatNumber value="12345.678" type= "currency" currencySymbol="￦"></fmt:formatNumber><br><br>

percent :
<fmt:formatNumber  value="12345.678" type= "percent"></fmt:formatNumber><br><br>

pattern = ".0" :
<fmt:formatNumber  value="12345.678" pattern= ".0"></fmt:formatNumber><br><br>

<c:set var="now" value="<%=new java.util.Date() %>"></c:set>

date : <fmt:formatDate value="${now}" type="date"/><br><br>
time : <fmt:formatDate value="${now}" type="time"/><br><br>
both : <fmt:formatDate value="${now}" type="both"/><br><br>

</body>
</html>