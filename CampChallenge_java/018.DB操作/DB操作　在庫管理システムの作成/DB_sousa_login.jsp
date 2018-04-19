<%-- 
    Document   : DB_sousa_login
    Created on : 2018/04/16, 14:50:19
    Author     : inagakiyuuichi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン画面</title>
    </head>
    <body>
        <h1>ユーザーログイン画面</h1>
        <hr>
        <div align="center">
            <teble border="0">
        <form action="./DB_sousa13_login" method="post">
            <tr>
                <th>
                  ユーザーネーム
                </th>
                <td>
                    <input type="text" name="name" value="" size="24">
                </td>
            </tr>
            <tr>
                <th> 
                 アドレス
                </th> 
                <td>
                    <input type="text" name="mail" value="" size="24">
                </td>
            </tr>
            <tr>
                <th>
                  パスワード
                </th>
                <td>
                    <input type="password" name="pass" value="" size="24">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                     <input type="submit" name="btnsubmit"value="ログイン">
                </td>
                
            </tr>
         </form>
            </table>
        </div>
   
    </body>
</html>
