<%-- 
    Document   : search
    Created on : 27.05.2020, 14:52:29
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Пошук книжок</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/jsp/header.jsp"/>
        <h1>Введіть інформацію про книгу</h1>
        <form action="SearchController" method="POST">
            <input type="radio" name="search"  value="name" required  > За назвою <br>
            <input type="radio" name="search"  value="author" required> За автором <br>
            <input type="radio" name="search"  value="keyWords" required>   За ключовими словами <br> <br>
          <label for="text">Текст для пошуку</label>
          <input type="text" name="text" placeholder="Введіть інформацію" required> 
          <input type="submit" name="button" value="Знайти">
        </form>
 
    </body>
</html>
