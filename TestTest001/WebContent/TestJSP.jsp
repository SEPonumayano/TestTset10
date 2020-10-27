<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="commonTest.CommonAddData"%>
<%
//変数定義
String day="2020/01/01";
String route_no="1";
String transit_no="2";
String from_st="御茶ノ水";
String to_st="東京";
String price="170";
int user_id=1;

//CommonAddDataクラスの呼び出し
CommonAddData data = new CommonAddData(day, route_no, transit_no, from_st, to_st, price, user_id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<p>getDayは、<%=data.getDay() %><p>


<p>getRoute_noは、<%=data.getRoute_no() %></p>


<p>getTransit_noは、<%=data.getTransit_no() %></p>


<p>getFrom_stは、<%=data.getFrom_st() %></p>


<p>getTo_stは、<%=data.getTo_st() %></p>

<p>getPriceは、<%=data.getPrice() %></p>


<p>getUser_idは、<%=data.getUser_id() %></p>


</body>
</html>