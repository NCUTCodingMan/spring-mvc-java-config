<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittles</title>
        <link rel="stylesheet" type="text/css" href="#">
    </head>

    <body>
        <h1>Recent Spittles</h1>
        <c:forEach items="${spittleList}" var="spittle">
            <li id="spittle_<c:out value="spittle.id" />"></li>
            <div>
                <c:out value="${spittle.message}" />
            </div>
            <div>
                <span><c:out value="${spittle.time}"/></span>
                <span><c:out value="${spittle.latitude}"/></span>
                <span><c:out value="${spittle.longitude}"/> </span>
            </div>
        </c:forEach>
    </body>
</html>