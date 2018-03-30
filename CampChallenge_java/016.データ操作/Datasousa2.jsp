<%-- 
    Document   : Datasousa2
    Created on : 2018/03/30, 11:20:08
    Author     : inagakiyuuichi
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
        request.setCharacterEncoding("UTF-8");
        
        out.print(request.getParameter("name"));
        out.print(request.getParameter("gender"));
        out.print(request.getParameter("hobby"));
        
        
     %>
    </body>
</html>
