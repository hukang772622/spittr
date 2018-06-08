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
    <a href="<c:url value="" />">Spitters</a> |
    <a href="<c:url value="homepage" />">Register1</a> |
    <a href="<s:url value="spitter/register" />">Register2</a> |
    <s:url value="/spitter/register" var="registerUrl" />
    <a href="${registerUrl}">Register3</a> |
    <s:url value="/spittles" var="spittlesUrl">
        <s:param name="max" value="60" />
        <s:param name="count" value="20" />
    </s:url>
    <a href="${spittlesUrl}">spittles</a><br/>

    <s:escapeBody htmlEscape="true">
        <h1>Hello</h1>
    </s:escapeBody>
    <br/>
    <s:escapeBody javaScriptEscape="true">
        <h1>Hello</h1>
    </s:escapeBody>

</body>
</html>
