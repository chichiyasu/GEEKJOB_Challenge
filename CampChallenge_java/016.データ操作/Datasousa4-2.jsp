<%-- 
    Document   : Datasousa4-2
    Created on : 2018/04/03, 13:30:47
    Author     : inagakiyuuichi
--%>
<!--■クエリストリング
例）http://localhost:8080/_some_project_/_some_file_.jsp?total=1500&count=10&type=2
・_some_project_ ... 自身のプロジェクト名に書き換えてください
・_some_file_.jsp ... 自身で作成したファイル名等に書き換えてください（ JSP ではなくサーブレットによって処理を記述しても構いません）
・total ... 購入した商品の総額を表す
・count ... 購入した商品の数量を表す
・type ... 商品種別を表す
（type の数値は， 1 が「雑貨」，2 が「生鮮食品」， 3 が「その他」と対応します）

■処理内容
1. type の値を元に，商品種別の日本語情報を表示してください。
2. 商品の単価を求め，画面に表示してください。
3. 商品購入総額に応じてポイントを計算し，その値を画面に表示してください。なお，ポイントの計算は，商品購入総額を基準にして，以下の要領で行います。
3000 円未満 ... 0%
3000 円以上で5000円未満 ... 購入総額の 4%
5000 円以上 ... 購入総額の 5%
-->

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
          
          int x=Integer.parseInt(request.getParameter("type"));
          int y=Integer.parseInt(request.getParameter("count"));
          String s="";
          double p=0;
          
          switch(x){
              
              case 1:
                x=600;
                s="雑貨";
               int num=x*y;
               
               if(num<3000){
                   
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。");
                                    
               }else if(num>5000){
                   p=num*0.05;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                                  
               }else{
                   p=num*0.04;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                   
               }
                 break;
               
              case 2:
                  x=500;
                  s="生鮮食品";
                  num=x*y;
                  
                   if(num<3000){
                   
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。");
                                    
               }else if(num>5000){
                   p=num*0.05;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                                  
               }else{
                   p=num*0.04;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                   
               }
                break;
                   
              case 3:
                  x=800;
                  s="その他";
                  num=x*y;
                  
                   if(num<3000){
                   
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。");
                                    
               }else if(num>5000){
                   p=num*0.05;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                                  
               }else{
                   p=num*0.04;
                   out.print(s+"を"+y+"点購入したので、合計"+num+"円になります。"+p+"ポイント取得しました。");
                   
               }
                  break;
                  
           
                  
              
              
              
              
              
              
          }
 








            
            
        
        
        
        
        
        %>
    </body>
</html>
