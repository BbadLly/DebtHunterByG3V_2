<%-- 
    Document   : ShowBoard
    Created on : Nov 7, 2020, 1:12:46 AM
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
<!--            <p> <c:out value="${d}"> </c:out></p>-->
        </c:forEach>

        <h1>Collector</h1>
        <c:forEach items= "${collectors}" var="c">
            <p> <c:out value="${c.debtName}"> </c:out></p>
            <p> <c:out value="${c.debtorMail}"> </c:out></p>
            <p> <c:out value="${c.description}"> </c:out></p>
            <p> <c:out value="${c.cost}"> </c:out></p>
<!--            <p> <c:out value="${c}"> </c:out></p>-->
        </c:forEach>
    </body>
</html>
