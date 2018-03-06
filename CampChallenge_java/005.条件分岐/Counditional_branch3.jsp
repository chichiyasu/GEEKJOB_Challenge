<%-- 
    Document   : Counditional_branch3
    Created on : 2018/03/06, 16:59:19
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    char hensu = 'B';
   
   switch(hensu){
       
       case 'A':
           out.print("英語");
           break;
       
       case 'あ':
           out.print("日本語");
           break;
           
       default :
               
   }
   
%>
