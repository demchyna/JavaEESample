<%@ page import="com.softserve.academy.model.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update existing Person Page</title>
</head>
<body>

    <%@include file="navbar.jsp"%>

    <%
        Person person = (Person) request.getAttribute("person");
    %>

    <form action="/person/update" method="post">
        <label for="id">Id: </label>
        <input type="text" disabled value="<%=person.getId()%>" id="id" style="margin-bottom: 10px"/><br>
        <label for="name">Name: </label>
        <input type="text" name="name" value="<%=person.getName()%>" id="name" style="margin-bottom: 10px"/><br>
        <label for="age">Age: </label>
        <input type="text" name="age" value="<%=person.getAge()%>" id="age" style="margin-bottom: 10px"/><br>

        <input type="hidden" name="id" value="<%=person.getId()%>"/>

        <input type="submit" value="Update Person"/>
        <input type="reset" value="Clear"/>
    </form>
</body>
</html>
