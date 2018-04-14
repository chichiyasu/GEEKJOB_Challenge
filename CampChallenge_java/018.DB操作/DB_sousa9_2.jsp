<%-- 
    Document   : DB_sousa9_2
    Created on : 2018/04/14, 17:15:02
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>挿入フォーム</title>
    </head>
    <body>
    <form action ="./DB_sousa9" method="post">
        
        ID:<input type="text" name="profilesID"><br>
        name:<input type="text" name="name"><br>
        tel:<input type="text" name="tel"><br>
        age:<input type="text" name="age"><br>
        birthday:<input type="text" name="birthday"><br>

        <input type ="submit" name="btnsubmit" value="挿入">
        
      
        
    </form>
        
        
        
        
        
    </body>
</html>
