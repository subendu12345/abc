<%-- 
    Document   : Welcome
    Created on : Sep 20, 2018, 12:05:51 PM
    Author     : skmoon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

            if(session.getAttribute("Username")==null)
            {
            response.sendRedirect("Login.jsp");
            }
            %>
        <h1>WelCOME ${Username}</h1> <a href="Video.jsp">Video</a>
        <br>
        <form action="Logout">
            <input type="submit" value="LOGOUT"/>
        </form>
    </body>
</html>
