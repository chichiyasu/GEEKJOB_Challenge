<%-- 
    Document   : Loop_processing2
    Created on : 2018/03/07, 17:09:10
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>

<%
   ArrayList<String>datas = new ArrayList<String>();
    
   
    
   for(int i=0;i<=30;i++){
       
         datas.add("A");
       
   }
   
    out.print(datas);





%>
