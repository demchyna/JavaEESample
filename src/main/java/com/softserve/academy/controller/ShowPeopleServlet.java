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
import java.io.PrintWriter;

@WebServlet(name = "ShowPeopleServlet", value = "/people")
public class ShowPeopleServlet extends HttpServlet {

    private PersonRepository personRepository = new PersonRepository();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/show-people.jsp");
        requestDispatcher.forward(request, response);
    }
}
