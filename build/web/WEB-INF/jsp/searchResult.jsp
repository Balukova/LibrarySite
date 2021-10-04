<%-- 
    Document   : searchResult
    Created on : 27.05.2020, 16:58:13
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Результат пошуку</title>
    </head>
    <body>

        <jsp:include page="/WEB-INF/jsp/header.jsp"/>
         <h1>Результат пошуку</h1>
            <c:set var="serchResult" value="${requestScope.serchResult}"></c:set>
        <c:forEach var="book" items="${serchResult}">
             <li><a href="${book.URL}">${book.name}</a></li>
        </c:forEach>
    </body>
</html>
