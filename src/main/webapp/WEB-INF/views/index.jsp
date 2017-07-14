<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello, {username}!
<br/>
<a href="<c:url value="/hello"/>">Go to user page</a>
<br/>
<a href="<c:url value="/admin"/>">Go to admin page</a>

</body>
</html>
