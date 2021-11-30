<%@ page language="java"   contentType="text/html; charset=UTF-8"
     import="java.util.*, sec01.ex01.*" 
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
%>    
<jsp:useBean  id="m"  class="sec01.ex01.MemberBean"  scope="page"/>
<%
   String   id=request.getParameter("id");
   String  pwd = request.getParameter("pwd");
   String  name = request.getParameter("name");
   String  email = request.getParameter("email");
 
  
   m.setId(id);
   m.setPwd(pwd);
   m.setName(name);
   m.setEmail(email);
   
   MemberDAO  memberDAO=new MemberDAO();
   memberDAO.addMember(m);
   List membersList = memberDAO.listMembers();	
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>members list</title>
</head>
<body>
  <table align="center"  width="100%">
	 <tr align="center" bgcolor="#99ccff">
	      <td width="7%" >id</td>
	      <td width="7%">pwd</td>
	      <td width="5%" >name</td>
	      <td width="11%" >email</td>
	      <td width="5%" >joindate</td>
	   </tr>
	<%
	   if(membersList.size()==0){
	%>
	  <tr>
	      <td colspan="5">
	        <p align="center"><b><span style="font-size:9pt;">
	           There are no registered members.</span></b></p>
	      </td>
	  </tr>
	<%
	}else{
	   for( int i = 0; i < membersList.size(); i++ ) {
	      MemberBean bean = (MemberBean) membersList.get(i);
	%>
	   <tr align="center">
	       <td><%=bean.getId() %></td>
	       <td><%=bean.getPwd() %></td>
	       <td><%=bean.getName() %></td>
	       <td><%=bean.getEmail() %></td>
	       <td><%=bean.getJoinDate() %></td>
	   </tr>
	<%
	      } // end for
	
	   } // end if
	%>
	   <tr height="1" bgcolor="#99ccff">
	      <td colspan="5"></td>
	   </tr>
	</table>
</body>
</html>