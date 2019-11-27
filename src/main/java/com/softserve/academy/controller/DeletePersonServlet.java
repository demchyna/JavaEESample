package com.softserve.academy.controller;

import com.softserve.academy.ropository.PersonRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletePersonServlet", value = "/person/delete")
public class DeletePersonServlet extends HttpServlet {

    private PersonRepository personRepository = new PersonRepository();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int personId = Integer.parseInt(request.getParameter("id"));
        personRepository.deletePerson(personId);
        response.sendRedirect("/");
    }
}
