<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Testing jsp</p>
<%
int i=1;
int j=3;
int k=i+j;
//out.println("k is "+k);
%>
value of k is:<%=k %>;

<%!
//This method will be available to all the scripts tag
public int add(int a,int b){
	return a+b;
}

%>
<%k=add(65243,863343);%>
the value of k is <%=k %>
<%for(i=0;i<5;i++){ %>
<br> the value of i<%=i %>
<%} %>
</body>
</html>