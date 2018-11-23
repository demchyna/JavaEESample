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

@WebServlet(name = "UpdatePersonServlet", value = "/person/update")
public class UpdatePersonServlet extends HttpServlet {

    private PersonRepository personRepository = new PersonRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int personId = Integer.parseInt(request.getParameter("id"));

        Person person = personRepository.getPersonById(personId);

        person.setName(request.getParameter("name"));
        person.setAge(Integer.parseInt(request.getParameter("age")));

        personRepository.updatePerson(person);

        response.sendRedirect("/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int personId = Integer.parseInt(request.getParameter("id"));

        Person person = personRepository.getPersonById(personId);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/update-person.jsp");
        request.setAttribute("person", person);
        requestDispatcher.forward(request, response);
    }
}
