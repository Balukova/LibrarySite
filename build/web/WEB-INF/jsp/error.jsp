<%
   String message = pageContext.getException().getMessage();
%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="Utf-8"%>

<html>

<head>
	 <link rel="stylesheet" type="text/css" href="style.css">
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exception</title>
</head>
<body>
<h2>Виникла помилка при обробці запиту</h2>
<h3>Повідомлення <%= message %></h3>
</body>
</html>