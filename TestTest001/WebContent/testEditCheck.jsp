<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="commonTest.*" import="java.sql.*"%>
<%
/** 登録か編集かの判断値**/
String menulist="2";

/** もし値の受け渡しがある場合用**/
//日付
String day="2020/01/01";
//片道or往復
String route_no="2";

//交通機関
String transit_no="1";

//出発駅
String from_st="";
//到着駅
String to_st="";
//金額
String price="0";

int id=1;

int user_id=1;

String route_name = CommonDB.getRouteName(route_no);
String transit_name = CommonDB.getTransitName(transit_no);

CommonUpdData data = new CommonUpdData(id, day,route_no, transit_no, from_st, to_st, price, user_id);

request.getSession().setAttribute("upddata", data);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
testEditCheckだよ
<form action="./EditCheck" class="table">
		<table>
			<tr>
				<th>日付</th>
				<th>:</th>
				<td><%=day%><input type="hidden" name="day"
					value="<%=day%>"></td>
			</tr>
			<tr>
				<th>片道or往復</th>
				<th>:</th>
				<td><%=route_name%><input type="hidden" name="route_name"
					value="<%=route_name%>"></td>
			</tr>
			<tr>
				<th>交通機関</th>
				<th>:</th>
				<td><%=transit_name%><input type="hidden" name="transit_name"
					value="<%=transit_name%>"></td>
			</tr>
			<tr>
				<th>出発駅</th>
				<th>:</th>
				<td><%=from_st%><input type="hidden" name="from_st"
					value="<%=from_st%>"></td>
				<th class="to">－ 到着駅</th>
				<th>:</th>
				<td><%=to_st%><input type="hidden" name="to_st"
					value="<%=to_st%>"></td>
			</tr>
			<tr>
				<th>運賃</th>
				<th>:</th>
				<td><%=price%>円
					<input type="hidden" name="price" value="<%=price%>"></td>
			</tr>
		</table>
		<br>
		<div>
			<input type="hidden" name="id" value="<%=id%>">
		</div>
		<div>
			<input type="submit" value="編集" class="leftbtn btn">
		</div>
		<div>
			<input type="submit" value="戻る" formaction="./edit.jsp"
				class="rightbtn btn">
		</div>
	</form>
</body>
</html>