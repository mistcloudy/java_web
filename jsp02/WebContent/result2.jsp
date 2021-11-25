<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
      request.setCharacterEncoding("utf-8");
      String user_id=request.getParameter("user_id");
      String user_pw=request.getParameter("user_pw");
   %>	
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Result output window</title>
</head>
<body>
<%if(user_id==null || user_id.length()==0){ %>
	To input id. <br>
	<a href="/jsp02/login.html">Go to login</a>
	<%
		}else {
	%>
   <h1>Welcome. <%=user_id  %> !!! </h1>
  <%
		}
  %>
</body>
</html>