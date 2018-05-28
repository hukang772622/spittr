<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        span.error {
            color: red
        }
        div.errors{
            background: #ffcccc;
            border: 2px solid red;
        }
        label.error {
            color: red;
        }
        input.error {
            background-color: #ffcccc;
        }
    </style>

</head>
<body>
    <h1>Register</h1>
    <%--<form method="post">--%>
        <%--First Name: <input type="text" name="firstName" /><br/>--%>
        <%--Last Name: <input type="text" name="lastName" /><br/>--%>
        <%--Username: <input type="text" name="username" /><br/>--%>
        <%--Password: <input type="password" name="password" /><br/>--%>
        <%--<input type="submit" value="Register">--%>
    <%--</form>--%>
    <sf:form method="post" modelAttribute="spitter">
        <sf:errors path="*" cssClass="errors" element="div" />
        <sf:label path="firstName" cssErrorClass="error"> First Name</sf:label>: <sf:input path="firstName" cssErrorClass="error"/>
        <sf:errors path="firstName"  cssClass="error"/><br/>
        Last Name: <sf:input path="lastName" />
                   <sf:errors path="lastName" /><br/>
        Username: <sf:input path="username" />
                  <sf:errors path="username" /><br/>
        Password: <sf:password path="password" />
                  <sf:errors path="password" /><br/>
        <input type="submit" value="Register">
    </sf:form>

</body>
</html>
