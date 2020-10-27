<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%

//getRouteAll
ResultSet getRouteAll = (ResultSet) request.getAttribute("getRouteAll");

//getRouteName
String getRouteName = (String) request.getAttribute("getRouteName");

//getTransitAll
ResultSet getTransitAll = (ResultSet) request.getAttribute("getTransitAll");

//getTransitName
String getTransitName = (String) request.getAttribute("getTransitName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>getRouteAll</p>
<%
while(getRouteAll.next()){
%>
<p>route_no=<%=getRouteAll.getString("route_no") %>,route_name=<%=getRouteAll.getString("route_name") %></p>
<%
}
%>
<br>

<p>getRouteName</p>
<p><%=getRouteName %></p>
<br>

<p>getTransitAll</p>
<%
while(getTransitAll.next()){
%>
<p>transit_no=<%=getTransitAll.getString("transit_no") %>,transit_name=<%=getTransitAll.getString("transit_name") %></p>
<%
}
%>
<br>

<p>getTransitName</p>
<p><%=getTransitName %></p>

</body>
</html>