<%-- 
    Document   : Main
    Created on : Oct 13, 2020, 8:55:24 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debt Hunter</title>
    </head>
    <body>
        <h1>Welcome to Debt Hunter - <a> ${user.firstname} ${user.lastname} </a> 
        <form action="Profile" method="post">
            <button type="submit" >Edit profile</button>
            <input type="number" name="id" value="${user.getId()}" hidden="">
        </form>
        
        </h1> 
        <h1>Collector</h1>
        <a href="AddDebt">Add+</a>
        <h1>Debtor</h1>
        <p><a href="Collector"> Collector </a> </p>
        <p><a href="Debtor"> Debtor </a> </p>
       
        
        <a href="Logout">Log out</a>
    </body>
</html>
