<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Register Form</title>
    <link rel="stylesheet" type="text/css" href="#">
</head>
    <body>
        <h1>Spitter Info</h1>
        <c:out value="${spitter.firstName}"/> : <c:out value="${spitter.lastName}"/>
        <br/>
        <c:out value="${spitter.username}"/> : <c:out value="${spitter.password}"/>
    </body>
</html>