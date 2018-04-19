<%-- 
    Document   : DB_sousa_product
    Created on : 2018/04/19, 11:16:23
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品一覧</title>
    </head>
    <body>
        <h1>商品情報一覧・追加</h1>
        <hr>
        <div align="0">
            <teble border="0">
        <form action="./DB_sousa13_product" method="post">
            <tr>  
            NO:   <input type="text" name="NO"><br>
            商品名: <input type="text" name="name"><br>
            価格:  <input type="text" name="price"><br>
            在庫数: <input type="text" name="count"><br>
            更新日: <input type="text" name="DofR"><br><br>
            
          
            <input type="submit" name="btnsubmit"value="追加">
            <input type="submit" name="btnsubmit"value="一覧">
            <a href="./DB_sousa_login.jsp">ログアウト</a>
            
            
            
        </form>
            </table>
        </div>
        
    </body>
</html>
