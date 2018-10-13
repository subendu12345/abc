<%-- 
    Document   : Video
    Created on : Sep 20, 2018, 12:06:14 PM
    Author     : skmoon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
             response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
          
            if(session.getAttribute("Username")==null)
            {
            response.sendRedirect("Login.jsp");
            }
            %>
        <h1>Hello World!</h1>
        
       <iframe width="560" height="315" src="https://www.youtube.com/embed/t_ImUjo80BU" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
    </body>
</html>
