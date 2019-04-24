package app.servlet;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ListUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//        writer.println("Get from app.servlet.ListUser servlet");

        Model model = Model.getInstance();
        List<String> names = model.getUserNames();
        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req, resp);

    }



}
