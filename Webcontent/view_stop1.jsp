<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>stop word</title>
</head>
<body>
	<table>
		<%
			ArrayList<String> al = (ArrayList<String>) request.getAttribute("stop");
			for (String s : al) {
				String line[] = s.split("\t\t");
				if (line.length >= 3) {
					String name = line[0];
					String time = line[1];
					String tweet = line[2];
		%>
		<tr>
			<td><%=name%></td>
			<td><%=time%></td>
			<td><%=tweet%></td>
		</tr>

		<%
			}
			}
		%>
	</table>
</body>
</html>