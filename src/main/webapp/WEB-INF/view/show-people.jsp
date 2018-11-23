<%@ page import="com.softserve.academy.model.Person" %>
<%@ page import="com.softserve.academy.ropository.PersonRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Show all People</title>
</head>
<body>

    <%@include file="navbar.jsp"%>

    <table border="1">
        <tr>
            <th> Id </th>
            <th> Name </th>
            <th> Age </th>
            <th colspan="2"> Delete / Update </th>
        </tr>

        <%! private PersonRepository personRepository = new PersonRepository(); %>

        <% for (Person person : personRepository.getAllPeople()) { %>

            <tr>

                <%
                    out.println("<td>" + person.getId() + "</td>");
                    out.println("<td>" + person.getName() + "</td>");
                    out.println("<td>" + person.getAge() + "</td>");
                %>
                <td>
                    <a href="/person/delete?id=<%=person.getId()%>">Remove</a>
                </td>
                <td>
                    <a href="/person/update?id=<%=person.getId()%>">Edit</a>
                </td>


            </tr>

        <% } %>

    </table>
</body>
</html>
