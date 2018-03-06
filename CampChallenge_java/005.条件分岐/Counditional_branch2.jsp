<%-- 
    Document   : Counditional_branch2
    Created on : 2018/03/06, 16:38:06
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  int num=1;
  switch(num){
      case 1:
     out.print("one");
     break;
    
      case 2:
      out.print("two");
      break;
          
    default:
       out.print("想定外");
       break;
    
}
  
 %>