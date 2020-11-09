<%-- 
    Document   : ConfirmedEdit
    Created on : Nov 9, 2020, 8:55:03 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="EditProfile" /> 
        <form action="EditProfile" method="">
        Password: <input type="password" name="password" required /> 
        </form>
    </body>
</html>
