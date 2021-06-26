<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2021
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>User Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: darkgray">
        <div>
            <a href="https://www.facebook.com/minhphuc2208/" class="navbar-brand"> Minh Phuc App </a>
        </div>

    </nav>
</header>
<br>

<div class="row">

    <div class="container">
        <h3 class="text-center">Note User Of Here</h3>
        <hr>
        <div class="container text-left">

            <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Note</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>username</th>
                <th>title</th>
                <th>content</th>

                <th>Actions</th>
            </tr>
            </thead>
            <tbody>


            <c:forEach var="note" items="${listnote}">

                <tr>
                    <td>${note.iduser}</td>
                    <td>${note.title}</td>
                    <td>${note.content}</td>

                    <td><a href="editServlet?id=${note.idnote}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="delete?id=${note.idnote}">Delete</a></td>
                </tr>
            </c:forEach>
            <!-- } -->
            </tbody>

        </table>
    </div>
</div>
</body>
</html>
