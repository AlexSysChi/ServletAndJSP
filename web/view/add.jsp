<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Alexey.Chistov
  Date: 29.06.2018
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New User JSP</title>
</head>
<body>
    add new user in JSP
    <br/>
    <%--<form method="post">--%>

        <%--<label>Name:--%>
            <%--<input type="text" name="name"><br />--%>
        <%--</label>--%>

        <%--<label>Password:--%>
            <%--<input type="password" name="pass"><br />--%>
        <%--</label>--%>
        <%--<button type="submit">Submit</button>--%>
    <%--</form>--%>

    <div>
        <div>
            <div>
                <h2>Users</h2>
            </div>
            <%
                List<String> names = (List<String>) request.getAttribute("userNames");

                if (names != null && !names.isEmpty()) {
                    out.println("<ui>");
                    for (String s : names) {
                        out.println("<li>" + s + "</li>");
                    }
                    out.println("</ui>");
                } else out.println("<p>There are no users yet!</p>");
            %>
        </div>
    </div>

    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>

</body>
</html>
