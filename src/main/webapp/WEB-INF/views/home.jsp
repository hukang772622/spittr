<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
    <s:message code="spittr.welcome" /><br/>
    <a href="<c:url value="home.jsp" />">Spitters</a> |
    <a href="<c:url value="home.jsp" />">Register</a>
</body>
</html>
