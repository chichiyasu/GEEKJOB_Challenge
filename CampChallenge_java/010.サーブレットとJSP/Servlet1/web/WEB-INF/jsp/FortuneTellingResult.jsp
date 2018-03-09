<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/03/09, 14:37:10
    Author     : inagakiyuuichi
--%>

<%@page import = "org.camp.servlet.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%
    ResultData data = (ResultData)request.getAttribute("DATA");


 %>
 
 <%
     if(data !=null){
         
         out.print("<h1>あなたの"+data.getD()+"運勢は、"+data.getLuck()+"です！</h1>");
         
         
     }
    
 %>
