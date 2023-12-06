<%-- 
    Document   : processRequest
    Created on : 25-Nov-2023, 1:04:23 pm
    Author     : delll
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DIvision of numbers</h1>
        <% 
            int n1=Integer.parseInt(request.getParameter("fn"));
            int n2=Integer.parseInt(request.getParameter("sn"));
        %>
        <%= "DIvision is : "+ (n1/n2)%>
    </body>
</html>
