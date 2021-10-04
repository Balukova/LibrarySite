<%-- 
    Document   : option
    Created on : 27.05.2020, 12:51:40
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Меню вибору</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/jsp/header.jsp"/>
        <h1>Доступні можливості</h1>
        <a href="/library/search.jsp">Пошук книжок</a>
        <c:if test = "${login !=null}">
        <br>
         <a href="/library/add.jsp">Додати книгу</a>
      </c:if>
    </body>
</html>
