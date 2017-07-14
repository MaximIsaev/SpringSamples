<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <p>Hello, ${pageContext.request.userPrincipal.name}!</p>
    <a href="<c:url value='/logout'/>">Logout</a>
</c:if>
</body>
</html>
