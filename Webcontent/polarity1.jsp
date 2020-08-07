<%@page import="polarity.PolarityRead"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Polarity</title>
</head>
<body>
<%
	HashMap<String,String> hm = (HashMap<String,String>)request.getAttribute("pol");
	String pos = hm.get("p");
	String neg = hm.get("n");
	String nut = hm.get("nut");
%>
<table>
<tr>
	<th>Polarity</th>
	<th>Calculation</th>
</tr>
<tr>
	<td>Positive</td>
	<td><%= pos%></td>
</tr>
<tr>
	<td>Negative</td>
	<td><%=neg %></td>
</tr>
<tr>
	<td>Neutral</td>
	<td><%=nut %></td>
</tr>
</table>
</body>
</html>