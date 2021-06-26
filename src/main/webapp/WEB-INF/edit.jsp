<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/6/2021
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="editServlet" method="post" >
  <input type="text" name="idnote" value="${note.idnote}" readonly>
    <input type="text" name="title" value="${note.title}">
    <input type="text" name="content" value="${note.content}" >
    <input type="submit" value="edit">

</form>
</body>
</html>
