<%-- 
    Document   : Collector
    Created on : Nov 14, 2020, 8:24:10 PM
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
        <h1>Collector</h1>
        <c:forEach items= "${collectors}" var="c">
            <p> <a href="Pay?debtId=" + ${c.debtId} > </a> </p>
            <p> <c:out value="${c.debtName}"> </c:out></p>
            <p> <c:out value="${c.debtorMail}"> </c:out></p>
            <p> <c:out value="${c.description}"> </c:out></p>
            <p> <c:out value="${c.cost}"> </c:out></p>
            <p> <c:out value="${c}"> </c:out></p>
        </c:forEach>
    </body>
</html>
