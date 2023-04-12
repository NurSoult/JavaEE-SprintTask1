package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.models.Tasks;

import java.io.IOException;

@WebServlet(value = "/saveTask")
public class SaveTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String title =request.getParameter("task_name");
        String description = request.getParameter("task_description");
        String deadline = request.getParameter("deadline");
        String status = request.getParameter("status");

        Tasks task = DBManager.getTask(id);
        if (task != null) {
            task.setName(title);
            task.setDescription(description);
            task.setDeadlineDate(deadline);
            task.setStatus(status);
            DBManager.updateTask(task);

            response.sendRedirect("/");
        }
        else {
            response.sendRedirect("/");
        }

    }
}
