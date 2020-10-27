<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" import="commonTest.CommonDB"%>
<%
/**入力値引継ぎ**/
String day=(String) request.getParameter("day");

String route_no=(String) request.getParameter("route_no");

String price=(String) request.getParameter("price");

String id=(String)request.getParameter("id");

String transit_no=(String)request.getParameter("transit_no");

String from_st=(String)request.getParameter("from_st");

String to_st=(String)request.getParameter("to_st");


ResultSet rs = CommonDB.getTransitDataAll(transit_no, from_st, to_st, 1 ,0);

int menuNo=2;
String menulist="2";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%=day %></p>
<!-- 交通手段一覧表示 -->
<table class="transitListCss" border="1">
<tr bgcolor="#D7EEFF">
<th class="transitname">交通機関</th>
<th class="fromst">出発駅</th>
<th class="tost">到着駅</th>
<th class="price">金額</th>
<th class="select"></th>
</tr>
<%
while(rs.next()){
%>
<form name="<%=rs.getString("data_id") %>"  method="get">
<tr>
<!-- 交通し手段の値を表示 -->
<td><%=rs.getString("transit_name") %></td>
<td><%=rs.getString("from_st") %></td>
<td><%=rs.getString("to_st") %></td>
<td><%=rs.getString("price") %>円</td>

<!-- 選択した値を渡す用 ->
<input name="data_id" type="hidden" value=<%=rs.getString("data_id") %>>-->
<input name="transit_no" type="hidden" value=<%=rs.getString("transit_no") %>>
<input name="from_st" type="hidden" value=<%=rs.getString("from_st") %>>
<input name="to_st" type="hidden" value=<%=rs.getString("to_st") %>>
<input name="price" type="hidden" value=<%=rs.getString("price") %>>
<%
if(menuNo==1){
%>
<!-- 登録画面へ戻る -->
<input type="hidden" name="menulist" value="<%=menulist%>">
<input type="hidden" name="day" value="<%=day%>">
<input type="hidden" name="route_no" value="<%=route_no%>">

<td><input class="selectbt" type="submit" formaction="Add" value="選択"></td>

<%}else{ %>
<!-- 編集画面へ戻る -->
<input type="hidden" name="menulist" value="<%=menulist%>">
<input type="hidden" name="day" value="<%=day%>">
<input type="hidden" name="route_no" value="<%=route_no%>">

<input type="hidden" name="id" value="<%=id%>">
<td><input class="selectbt" type="submit" formaction="edit.jsp" value="選択"></td>

<%
}
%>
</tr>
</form>
<%
}
%>
</table>

<!-- 戻るボタン表示 -->
<form method="get">
<%
if(menuNo==1){
%>
<!-- 登録画面へ戻る -->
<input type="hidden" name="menulist" value="<%=menulist%>">
<input type="hidden" name="day" value="<%=day%>">
<input type="hidden" name="route_no" value="<%=route_no%>">
<input type="hidden" name="id" value="<%=id%>">
<input type="hidden" name="transit_no" value="<%=transit_no%>">
<input type="hidden" name="from_st" value="<%=from_st%>">
<input type="hidden" name="to_st" value="<%=to_st%>">
<input type="hidden" name="price" value="<%=price%>">
<input class="returnbt" type="submit" formaction="Add" value="戻る">
<%
}else{
%>
<!-- 編集画面へ戻る -->
<input type="hidden" name="menulist" value="<%=menulist%>">
<input type="hidden" name="day" value="<%=day%>">
<input type="hidden" name="route_no" value="<%=route_no%>">
<input type="hidden" name="id" value="<%=id%>">
<input type="hidden" name="transit_no" value="<%=transit_no%>">
<input type="hidden" name="from_st" value="<%=from_st%>">
<input type="hidden" name="to_st" value="<%=to_st%>">
<input type="hidden" name="price" value="<%=price%>">
<input class="returnbt" type="submit" formaction="edit.jsp"  value="戻る">
<%
}
%>
</form>
</body>
</html>