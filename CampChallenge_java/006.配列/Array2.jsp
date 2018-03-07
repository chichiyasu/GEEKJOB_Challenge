<%-- 
    Document   : Array2
    Created on : 2018/03/07, 13:14:36
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.ArrayList" %>
<%
 ArrayList<String>  datas=new ArrayList<String>();

   datas.add("10");
   datas.add("100");
   datas.add("soeda");
   
    datas.set(2,"33");
    
   datas.add("hayashi");
   datas.add("-20");
   datas.add("118");
   datas.add("END");
   
   out.print(datas);



%>
