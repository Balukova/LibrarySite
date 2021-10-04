<%-- 
    Document   : book
    Created on : 27.05.2020, 17:45:51
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Інформація про книгу</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/jsp/header.jsp"/>
        <h1>Інформація про книгу</h1>
        Назва: ${book.name} <br>
        Автори: ${book.authors} <br>
        Ключові слова: ${book.keyWords}
        <c:if test = "${login !=null}">
        <form action="DeleteController" method="POST">
            <input type="hidden" name="name" value="${book.name}">
            <input type="hidden" name="authors" value="${book.authors}">
            <input type="submit" name="button" value="Видалити">
        </form>
        <form action="change.jsp?oldName1=${book.name}&oldAuthors1=${book.authors}" method="POST" accept-charset="UTF-8">
            <input type="submit" name="button" value="Редагувати">
        </form>
        </c:if>
    </body>
</html>
