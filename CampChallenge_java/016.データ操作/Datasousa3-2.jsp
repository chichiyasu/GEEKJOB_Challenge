<%-- 
    Document   : Datasousa4
    Created on : 2018/03/30, 14:50:58
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
         
         out.println(request.getParameter("name")); 
         out.println(request.getParameter("mail"));
         out.println(request.getParameter("pass"));
         
         
     %>
        
        
        
        
        
    </body>
</html>
