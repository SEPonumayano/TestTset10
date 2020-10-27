<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%
//1-1-1-11 getTransitDataCnt11
int getTransitDataCnt11=(int)request.getAttribute("getTransitDataCnt11");

//1-1-1-12 getTransitDataCnt12
int getTransitDataCnt12=(int)request.getAttribute("getTransitDataCnt12");

//1-1-1-13 getTransitDataCnt13
int getTransitDataCnt13=(int)request.getAttribute("getTransitDataCnt13");

//1-1-1-14 getTransitDataCnt
int getTransitDataCnt14=(int)request.getAttribute("getTransitDataCnt14");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>1-1-1-11 getTransitDataCnt11</p>
<p><%=getTransitDataCnt11 %></p>
<br>

<p>1-1-1-12 getTransitDataCnt12</p>
<p><%=getTransitDataCnt12 %></p>
<br>

<p>1-1-1-13 getTransitDataCnt13</p>
<p><%=getTransitDataCnt13 %></p>
<br>

<p>1-1-1-14 getTransitDataCnt14</p>
<p><%=getTransitDataCnt14 %></p>
<br>

</body>
</html>