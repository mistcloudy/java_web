<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<fmt:setLocale value="en"/>--%>
 <fmt:bundle basename="bundle.testBundle">
<fmt:message var="title" key="TITLE"></fmt:message>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>${title}</title>
</head>
<body>
<fmt:message key="NAME"></fmt:message>
<br>

<c:if test="${!empty param.id }">
<fmt:message>
<fmt:param value="${param.id }"></fmt:param>
</fmt:message>
</c:if>

</body>
</html>
</fmt:bundle>