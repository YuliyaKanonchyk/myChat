<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Authorization</title>
    <h1>Authorization page</h1>
    <br>
</head>
<body>
<form action="${pageContext.request.contextPath}/auth" method="post">
    <input type="text" name="login" placeholder="login">
    <input type="password" name="password" placeholder="password">
    <button>Submit</button>
</form>
</body>
</html>
