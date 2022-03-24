<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:catch var="ex">

name parameter value =<%=request.getParameter("name") %> <br><br>
<%if(request.getParameter("name").equals("bird")){ %>
${param.name } is bird.
<%} %>
</c:catch>
<br><br>
<c:if test="${ex != null }">
Error! 
</c:if>

</body>
</html>