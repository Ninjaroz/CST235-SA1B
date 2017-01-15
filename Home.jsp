<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--
Author: Gary
--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CST235_Week01_ShortAssignment_1b2</title>
</head>
<body>
<jsp:useBean id='Assignment1b' scope="request" class="Assignment_1b2.CST235_Week01_ShortAssignment_1b2">
</jsp:useBean>
<jsp:useBean id='SBean' scope="request" class="Assignment_1b2.CST235_SessionBean">
</jsp:useBean>
<%
out.print("This is a Entity Bean class call");
out.print("<br/>");
out.print(Assignment1b.ReadFileCalculateCounts());
out.print("<br/>");
out.print("This is a session Bean class call");
out.print("<br/>");
out.print(SBean.ReadFileCalculateCounts());
%>

</body>
</html>