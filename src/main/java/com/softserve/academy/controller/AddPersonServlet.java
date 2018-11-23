package com.softserve.academy.controller;

import com.softserve.academy.model.Person;
import com.softserve.academy.ropository.PersonRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPersonServlet", value = "/person/add")
public class AddPersonServlet extends HttpServlet {

    private PersonRepository personRepository = new PersonRepository();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String personName = request.getParameter("name");
        int personAge = Integer.parseInt(request.getParameter("age"));

        personRepository.addPerson(new Person(personName, personAge));

        response.sendRedirect("/");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/add-person.jsp");
        requestDispatcher.forward(request, response);
    }
}
