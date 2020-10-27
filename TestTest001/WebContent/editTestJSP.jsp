<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String getErrMsg=(String)request.getAttribute("errmsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>errMsg</p>
<p><%=getErrMsg%></p>

<!--  <form action="Edit" method="get">
<input type="hidden" name="id" value="1">
<input type="hidden" name="day" value="2020/02/02">
<input type="hidden" name="route_no" value="1">
<input type="hidden" name="transit_no" value="2">
<input type="hidden" name="from_st" value="テストA">
<input type="hidden" name="to_st" value="テストB">
<input type="hidden" name="price" value="1000">
<input type="submit" value="editのサーブレットへ">
</form>-->
</body>
</html>