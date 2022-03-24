<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <% 
    request.setAttribute("name", "홍길동");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

요청 URI : ${pageContext.request.requestURI } <br><br>
request의 name 속성 : ${requestScope.name } <br><br>
code 파라미터 : ${param.code }
<br><br>

</body>
</html>