<%-- 
    Document   : Associative_Array
    Created on : 2018/03/07, 14:12:55
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.HashMap" %>

<% 
   HashMap<String,String> hash=new HashMap<String,String>();
   
    hash.put("1", "AAA");
    hash.put("Hello", "world");
    hash.put("soeda", "33");
    hash.put("20","20");

    out.print(hash);
    
    

%>