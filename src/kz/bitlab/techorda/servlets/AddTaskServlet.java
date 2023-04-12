package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.models.Tasks;

import java.io.IOException;


@WebServlet(value = "/addTask")
public class AddTaskServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title =request.getParameter("task_name");
        String description = request.getParameter("task_description");
        String deadline = request.getParameter("deadline");

        Tasks t = new Tasks();

        t.setName(title);
        t.setDescription(description);
        t.setDeadlineDate(deadline);
        t.setStatus("Not completed");

        DBManager.addTask(t);

        response.sendRedirect("/home");
    }


}
