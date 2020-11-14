<%-- 
    Document   : Paid
    Created on : Nov 14, 2020, 8:34:19 PM
    Author     : GuideKai
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Payment" method="POST">
            <c:forEach items= "${debts}" var="d">
            <p> <c:out value="${d.debtName}"> </c:out></p>
            <p> <c:out value="${d.debtorMail}"> </c:out></p>
            <p> <c:out value="${d.description}"> </c:out></p>
            <p> <c:out value="${d.cost}"> </c:out></p>  
        </c:forEach> 
            <input type="number" name="id" value="${id}" hidden>
            <input type="number" name="pay" required/>
            <input type="submit">
        </form>
    </body>
</html>
