<%-- 
    Document   : Profile
    Created on : Nov 9, 2020, 8:07:23 PM
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
        <h1>${user.firstname} ${user.lastname}</h1> <a href="EditProfile"> Edit </a>
        <p> ${user.email} </p>
        <p> ${user.tel} </p>
        
    </body>
</html>
