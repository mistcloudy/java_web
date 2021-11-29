<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" %>

<!DOCTYPE html>          
<html>
<head>
   <title>Error page</title>
</head>
<body>
    ====== toString() content ======= <br>
   <h1><%= exception.toString()  %> </h1>
=============== getMessage() content ==========<br>
   <h1><%=exception.getMessage()%> </h1>
   ============= printStackTrace() content =======<br>
   <h1><% exception.printStackTrace(); %> </h1>
   <h3>
  You can only enter numbers.Try again.
   <a href='add.html'>Retry</a>
   </h3>
</body>
</html>