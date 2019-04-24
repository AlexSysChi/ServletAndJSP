<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Alexey.Chistov
  Date: 29.06.2018
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User LIst JSP</title>
</head>
<body>
    list user in JSP <br/>

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

</body>
</html>
