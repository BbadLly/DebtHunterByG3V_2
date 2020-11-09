<%-- 
    Document   : Debt
    Created on : Oct 22, 2020, 3:33:30 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debt Hunter - Main</title>
    </head>
    <body>
        <form action="AddToBoard" method="POST">
            Debt  
            <p>Debt name </p>
            <p><input type="text" name="debtname" value="" required/></p>
            <p>Debtor </p>
            <p><input type="email" name="email" value="" required/></p>
            <p>Description </p>
            <p><input type="text" name="description" value=""></p>
            <p>Cost</p>
            <p><input type="number" name="cost" value="" required/></p>
            <p><input type="submit" name="Add"></p>  
            ${message}
        </form>
    </body>
</html>
