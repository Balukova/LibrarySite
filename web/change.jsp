<%-- 
    Document   : change
    Created on : 27.05.2020, 18:05:36
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page pageEncoding="Utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Зміна інформації про книгу</title>
    </head>
    <body>
                <jsp:include page="/WEB-INF/jsp/header.jsp"/>
        <h1>Введіть нову інформацію про книгу</h1>
        <form action="ChangeController" method="POST">
          <label for="name">Назва книги</label>
          <input type="text" name="name" placeholder="Введіть назву" required> <br>
          <label for="name">Автори книги</label>
          <input type="text" name="authors" placeholder="Введіть авторів" required> <br>
          <label for="keyWords">Ключові слова</label>
          <input type="text" name="keyWords" placeholder="Введіть ключові слова" required> <br> <br>
          <%
String oldName1=request.getParameter("oldName1");
String oldAuthors1=request.getParameter("oldAuthors1");
%>
          <input type="hidden" name="oldName" value="<%=oldName1%>">
          <input type="hidden" name="oldAuthors" value="<%= oldAuthors1%>">
          <input type="submit" name="button" value="Змінити">
        </form>
    </body>
</html>
