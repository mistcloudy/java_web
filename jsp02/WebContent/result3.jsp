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
<title>Result output window</title>
  <meta charset="UTF-8">
</head>
<body>
<%
if(user_id==null || user_id.length()==0){
	%>
	To input id. <br>
	<a href="/jsp02/login.html">Go to login</a>
	<%
		}else {
			if(user_id.equals("admin")){
	%>
	<h1>login to admin</h1>
	<form>
	<input type=button value="delete membership" />
	<input type=button value="correct membership" />
	</form>
	<%
			}else{
	%>
   <h1>Welcome. <%=user_id  %> !!! </h1>
  <%
		}
	}
  %>
</body>
</html>