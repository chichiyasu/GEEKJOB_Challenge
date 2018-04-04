<%-- 
    Document   : Dataasousa8
    Created on : 2018/04/04, 15:27:24
    Author     : inagakiyuuichi
--%>
<!--
以下の機能を実現してください。
・名前，性別，趣味の情報をフォームによって送信することができる。
・フォームによって値を送信すると，次回アクセス時に，その値がフォームの初期値となる（セッションかクッキーを利用する）。
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
  request.setCharacterEncoding("UTF-8");  
  //変数宣言
  HttpSession Userinfo  = request.getSession();
   
  //param
  String UserName=request.getParameter("name");
  String UserSex=request.getParameter("sex");
  String UserHobby=request.getParameter("hobby");
  
  //登録
  Userinfo.setAttribute("Name",UserName);
  Userinfo.setAttribute("Sex",UserSex);
  Userinfo.setAttribute("Hobby",UserHobby);
  
  //変数に代入
  Object n =Userinfo.getAttribute("Name");
  Object s =Userinfo.getAttribute("Sex");
  Object h =Userinfo.getAttribute("Hobby");
  
 
    
    if(n==null){
        n="";    
    }
    if(s==null){
        s="";     
    }
    if(h==null){
        h="";
    }
    
    out.print("名前:"+n+"<br>");
    out.print("性別:"+s+"<br>");
    out.print("趣味:"+h+"<br>");
    
    

 %>
