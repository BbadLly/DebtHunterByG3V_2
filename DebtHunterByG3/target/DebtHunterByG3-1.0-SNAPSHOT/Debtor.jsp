<%-- 
    Document   : Debtor
    Created on : Nov 14, 2020, 8:22:10 PM
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
        <h1>Debtor</h1>
        <c:forEach items= "${debts}" var="d">
            <p> <c:out value="${d.debtName}"> </c:out></p>
            <p> <c:out value="${d.debtorMail}"> </c:out></p>
            <p> <c:out value="${d.description}"> </c:out></p>
            <p> <c:out value="${d.cost}"> </c:out></p>  
            <form action="Pass" method="get">
            <Input type="Hidden" name="id" value="${d.debtId}">
            <button type="submit">Pay</button>
    </form>
        </c:forEach>
    </body>
</html>
