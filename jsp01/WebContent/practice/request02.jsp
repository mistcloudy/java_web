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

<h3> �Ķ���� �� ó��</h3>
<br>
<form action="request02.jsp" method="post">
	�̸� : 	<input type="text" name="name" value= "${param['name']}">
			<input type="submit" value= "Ȯ��">

</form>
<p>
�̸��� : ${param.name} �Դϴ�.
</p>
</body>
</html>