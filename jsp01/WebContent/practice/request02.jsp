<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3> 파라미터 값 처리</h3>
<br>
<form action="request02.jsp" method="post">
	이름 : 	<input type="text" name="name" value= "${param['name']}">
			<input type="submit" value= "확인">

</form>
<p>
이름은 : ${param.name} 입니다.
</p>
</body>
</html>