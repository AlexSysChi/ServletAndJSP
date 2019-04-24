package app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<title>test *** project</title>" +
                "<h5>test app from servlet</h5>\n" +
                "</div>\n" +
                "\n" +
                "<div>       <!-- content -->\n" +
                "    <div>    <!-- buttons holder -->\n" +
                "        <button onclick=\"location.href='/list'\">List users</button>\n" +
                "        <button onclick=\"location.href='/add'\">Add user</button>\n" +
                "    </div>\n" +
                "</div>");

    }
}
