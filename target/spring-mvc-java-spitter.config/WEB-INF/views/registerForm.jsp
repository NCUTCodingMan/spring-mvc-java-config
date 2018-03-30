<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Register Form</title>
        <link rel="stylesheet" type="text/css" href="#">
    </head>
    <body>
        <h1>Spitter Register</h1>
        <form method="post">
            First Name: <input type="text" name="firstName" /> <br/>
            Last Name: <input type="text" name="lastName" /> <br/>
            Username: <input type="text" name="username" /> <br/>
            Password: <input type="password" name="password" /> <br/>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>