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
        <h1>Welcome to Debt Hunter - <a href="Profile"> ${user.firstname} ${user.lastname} </a> </h1> 
        <h1>Collector</h1>
        <a href="AddDebt">Add+</a>
        <c:forEach items= "${collectors}" var="c">
            <p> <a href="Pay?debtId=" + ${c.debtId} > </a> </p>
            <p> <c:out value="${c.debtName}"> </c:out></p>
            <p> <c:out value="${c.debtorMail}"> </c:out></p>
            <p> <c:out value="${c.description}"> </c:out></p>
            <p> <c:out value="${c.cost}"> </c:out></p>
<!--            <p> <c:out value="${c}"> </c:out></p>-->
        </c:forEach>
        
        <h1>Debt</h1>
        <c:forEach items= "${debts}" var="d">
            <p> <c:out value="${d.debtName}"> </c:out></p>
            <p> <c:out value="${d.debtorMail}"> </c:out></p>
            <p> <c:out value="${d.description}"> </c:out></p>
            <p> <c:out value="${d.cost}"> </c:out></p>
<!--            <p> <c:out value="${d}"> </c:out></p>-->
        </c:forEach>
    

        <p><a href="Test"> Board </a> </p>
        <p><a href="Test2"> Board2 </a> </p>
       
        
        <a href="Logout">Log out</a>
    </body>
</html>
