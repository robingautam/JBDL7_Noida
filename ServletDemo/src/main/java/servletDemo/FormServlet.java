package servletDemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("inside the doPost Method");
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");

        resp.setContentType("text/plain");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<h1>"+firstName+" "+lastName+"</h1>");


    }
}
