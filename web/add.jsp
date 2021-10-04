<%-- 
    Document   : add
    Created on : 27.05.2020, 16:19:24
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Додати книгу</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/jsp/header.jsp"/>
        <h1>Введіть інформацію про книгу</h1>
        <form action="AddController" method="POST">
          <label for="name">Назва книги</label>
          <input type="text" name="name" placeholder="Введіть назву" required> <br>
          <label for="name">Автори книги</label>
          <input type="text" name="authors" placeholder="Введіть авторів" required> <br>
          <label for="keyWords">Ключові слова</label>
          <input type="text" name="keyWords" placeholder="Введіть ключові слова" required> <br> <br>
          <input type="submit" name="button" value="Додати">
        </form>
    </body>
</html>
