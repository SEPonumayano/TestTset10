<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.ResultSet" import="commonTest.CommonDB"%>
<%
int user_id=1;
int limitSta=0;
ResultSet rs=CommonDB.getTransitListAll(limitSta, user_id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form >
		<table class="table1">
			<tr class="tr1" style="background-color: #99CCFF;">
				<td class="td1"><b>日付</b></td>
				<td class="td1"><b>片道or往復</b></td>
				<td class="td1"><b>交通機関</b></td>
				<td class="td1"><b>出発駅</b></td>
				<td class="td1"><b>到着駅</b></td>
				<td class="td1"><b>金額</b></td>
				<td></td>
			</tr>

			<% while(rs.next()){ %>
			<form method="get" name="<%= rs.getInt("id")%>">
			<tr class="tr2">
				<input type="hidden" name="id" value="<%=rs.getString("id")%>">
				<td class="td1"><%=rs.getString("day").replace('-', '/')%><input type="hidden" name="day" value="<%=rs.getString("day").replace('-', '/')%>"></td>
				<td class="td1"><%=rs.getString("route_name")%><input type="hidden" name="route_name" value="<%=rs.getString("route_name")%>"></td>
				<td class="td1"><%=rs.getString("transit_name")%><input type="hidden" name="transit_name" value="<%=rs.getString("transit_name")%>"></td>
				<td class="td1"><%=rs.getString("from_st")%><input type="hidden" name="from_st" value="<%=rs.getString("from_st")%>"></td>
				<td class="td1"><%=rs.getString("to_st")%><input type="hidden" name="to_st" value="<%=rs.getString("to_st")%>"></td>
				<td class="td1"><%=rs.getString("price")%>円<input type="hidden" name="price" value="<%=rs.getString("price")%>"></td>

				<td class="td2"><input type="submit" value="編集" formaction="edit.jsp"style="background-color:#C0C0C0;" class="btn1"></td>
			</tr>
			</form>
			<% }%>
		</table>
	</form>
</body>
</html>