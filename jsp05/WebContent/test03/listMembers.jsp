<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
<c:choose>
   <c:when test='${msg=="addMember" }'>
      <script>
         window.onload=function(){
            alert("registered as a member.");
         }
      </script>
   </c:when>
   <c:when test='${msg=="modified" }'>
      <script>
        window.onload=function(){
          alert("modified the membership information.");
        }
      </script>
   </c:when>
   <c:when test= '${msg=="deleted" }'>
      <script>
         window.onload=function(){
            alert("deleted the membership information.");
        } 
      </script>
</c:when>
</c:choose>
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
         <td width="7%" ><b>modify</b></td>
         <td width="7%" ><b>delete</b></td>
   </tr>

<c:choose>
    <c:when test="${ empty membersList}" >
      <tr>
        <td colspan=5>
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
            <td><a href="${contextPath}/member1/modMemberForm.do?id=${mem.id }">modify</a></td>
		   <td><a href="${contextPath}/member1/delMember.do?id=${mem.id }">delete</a></td>    
       </tr>
     </c:forEach>
</c:when>
</c:choose>
   </table>  
 <a href="${contextPath}/member/memberForm.do"><p class="cls2">to join</p></a>
</body>
</html>