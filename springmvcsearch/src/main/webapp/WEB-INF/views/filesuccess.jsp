<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File uploaded result...</title>
</head>
<body>

<h1>${msg }</h1>
<img alt="profile image" src='<c:url value="/recources/image/${filename }" />'>

</body>
</html>