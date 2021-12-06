<%@ page language="java" contentType="text/html; charset=UTF-8"
	import=" java.util.*,sec01.ex01.*"
	pageEncoding="UTF-8"
	isELIgnored="false" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
   <meta  charset="UTF-8">
   <title>Member list output</title>
<style>
     .cls1 {
       font-size:40px;
       text-align:center;
     }
    
     .cls2 {
       font-size:20px;
       text-align:center;
     }
  </style>
  
</head>
<body>
 <p class="cls1">Member list</p>
   <table align="center" border="1" >
      <tr align="center" bgcolor="lightgreen">
         <td width="7%" ><b>id</b></td>
         <td width="7%" ><b>pwd</b></td>
         <td width="7%" ><b>name</b></td>
         <td width="7%"><b>email</b></td>
         <td width="7%" ><b>joindate</b></td>
   </tr>

<c:choose>
    <c:when test="${ empty membersList}" >
      <tr>
        <td colspan=5 align="center">
          <b>There are no registered members.</b>
       </td>  
      </tr>
   </c:when>  
   <c:when test="${!empty membersList }" >
      <c:forEach  var="mem" items="${membersList }" >
        <tr align="center">
          <td>${mem.id }</td>
          <td>${mem.pwd }</td>
          <td>${mem.name}</td>     
          <td>${mem.email }</td>     
          <td>${mem.joinDate}</td>     
       </tr>
     </c:forEach>
</c:when>
</c:choose>
   </table>  
 <a href="#"><p class="cls2">to join</p></a>
</body>
</html>