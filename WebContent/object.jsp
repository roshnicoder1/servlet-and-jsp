<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//out

out.println("this is jsp");
%>
<%
String firstname=request.getParameter("firstName");
if(firstname!=null){
    session.setAttribute("SessionUserName",firstname);
    //application.setAttribute("applicationUserName",firstname);
    pageContext.setAttribute("pageContextUserName",firstname);
    pageContext.setAttribute("applivationUserName",firstname,PageContext.APPLICATION_SCOPE);
 


   }
%>
REquest object firstname is<%=firstname %>
<br>
In session object:User First name is<%=session.getAttribute("SessionUserName") %>

<br>
In pageContext object:User First name is<%=pageContext.getAttribute("pageContextUserName") %>
<br>

application<%=(String)pageContext.getAttribute("applivationUserName",PageContext.APPLICATION_SCOPE)%>
</body>
</html>