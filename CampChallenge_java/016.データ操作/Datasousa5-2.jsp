<%-- 
    Document   : Datasousa5-2
    Created on : 2018/04/03, 14:28:42
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
        
        int i =Integer.parseInt(request.getParameter("textBox"));
        
        out.print(i+"=");
        
        
         while(i%2==0){
            out.println(2);
            out.print("*");
            i/=2;
         }
         for(int num=3;num*num<=i;num++){
             while(i%num==0){
               out.print(num);
               out.print("*");
               i/=num;
             
             }
         }
         
         if(i>1){
             out.print("あまりは"+i+"です");
             
         }
    
         
    
        
        
        
        
        
        
        




      %>
        
    </body>
</html>
