package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.models.Tasks;

import java.io.IOException;

@WebServlet(value = "/details")
public class TaskDetails extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        Tasks t = DBManager.getTask(id);

        if (t != null) {
            request.setAttribute("task", t);
            request.getRequestDispatcher("/details.jsp").forward(request, response);
        }
        else {
            response.sendRedirect("/home");
        }


    }
}
