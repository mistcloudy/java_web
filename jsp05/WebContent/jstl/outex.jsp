<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import= "java.io.IOException, java.io.FileReader" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>source</title>
</head>
<body>
<%
FileReader r = null;
// http://localhost:8090/JspExample/jstl/outex.jsp?
try{
	String path = request.getParameter("path");
	r = new FileReader(getServletContext().getRealPath(path));
%>
<pre>
	source code =<%=path %>
	<c:out value ="<%=r%>" escapeXml="true" ></c:out>
</pre>
<%}catch(IOException ii){ %>

error : <%=ii.getMessage() %>

<%}finally { 
	if(r !=null) 
		try {
			r.close();
		}catch(IOException ee){
			ee.printStackTrace();
		}
}
%>
</body>
</html>