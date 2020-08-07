<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>emotions</title>
</head>
<body>
	<table>
		<%
			ArrayList<String> al = (ArrayList<String>) request.getAttribute("emotion");
			for (String s : al) {
				String values[] = s.split("\t\t");
				if (values.length >= 3) {
					String name = values[0];
					String time = values[1];
					String tweet = values[2];
		%>
		<tr>
			<td><%=name%></td>
			<td><%=time %></td>
			<td><%=tweet %></td>
		</tr>
		<%
			}
			}
		%>
	</table>
</body>
</html>