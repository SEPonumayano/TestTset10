<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%
//1-1-1-19 isUser
boolean isUser=(boolean)request.getAttribute("isUser");

//1-1-1-20 getUsercategoryAll
ResultSet getUsercategoryAll=(ResultSet)request.getAttribute("getUsercategoryAll");

//1-1-1-21 getUserId
int getUserId=(int)request.getAttribute("getUserId");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>1-1-1-19 isUser</p>
<p><%=isUser %></p>
<br>

<p>1-1-1-20 getUsercategoryAll</p>
<%
while(getUsercategoryAll.next()){
%>
<p>role_id=<%=getUsercategoryAll.getString("role_id") %>,role_name=<%=getUsercategoryAll.getString("role_name") %></p>
<%
}
%>
<br>

<p>1-1-1-21 getUserId</p>
<p><%=getUserId %></p>

</body>
</html>