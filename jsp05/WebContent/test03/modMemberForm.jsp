<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%> 
<head>
   <meta charset="UTF-8">
   <title>Member list modify window</title>
   <style>
  .cls1 {
     font-size:40px;
     text-align:center;
   }
</style>
</head>
<body>
<h1 class="cls1">Member list modify window</h1>
<form  method="post" action="${contextPath}/member1/modMember.do?id=${memInfo.id}">
<table  align="center">
    <tr>
       <td width="200"><p align="right">id</td>
      <td width="400"><input   type="text" name="id" value="${memInfo.id}" disabled ></td>
    </tr>
    <tr>
        <td width="200"><p align="right">pwd</td>
         <td width="400"><input   type="password" name="pwd" value="${memInfo.pwd}" >
    </tr>
    <tr>
        <td width="200"><p align="right">name</td>
         <td width="400"><input   type="text" name="name" value="${memInfo.name}" ></td>
    </tr>
    <tr>
        <td width="200"><p align="right">email</td>
        <td width="400"><input   type="text" name="email"  value="${memInfo.email}" ></td>
    </tr>
    <tr>
     <td width="200"><p align="right" >joindate</td>
     <td width="400"><input   type="text"  name="joinDate" value="${memInfo.joinDate }" disabled  ></td>
  	 </tr>
    <tr align="center" >
    <td colspan="2" width="400"><input type="submit" value="modify" >
	       <input type="reset" value="reset"> </td>
    </tr>
</table>
</form>
</html>