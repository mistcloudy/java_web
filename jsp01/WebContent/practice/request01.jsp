<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <% 
    request.setAttribute("name", "ȫ�浿");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

��û URI : ${pageContext.request.requestURI } <br><br>
request�� name �Ӽ� : ${requestScope.name } <br><br>
code �Ķ���� : ${param.code }
<br><br>

</body>
</html>