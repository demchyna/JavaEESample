<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add new Person Page</title>
</head>
<body>

    <%@include file="navbar.jsp"%>

    <form action="/person/add" method="post">
        <label for="name">Name: </label>
        <input type="text" name="name" id="name" style="margin-bottom: 10px"/><br>
        <label for="age">Age: </label>
        <input type="text" name="age" id="age" style="margin-bottom: 10px"/><br>
        <input type="submit" value="Add Person"/>
        <input type="reset" value="Clear"/>
    </form>
</body>
</html>
