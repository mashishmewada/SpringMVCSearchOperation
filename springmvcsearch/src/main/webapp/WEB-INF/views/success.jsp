<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <h1>Student Details</h1>
<h3>Student Name is : ${student.name }</h3>
<h3>Student Email is : ${student.email }</h3>
<h3>Student ID is : ${student.id }</h3>
<h3>Student DOB is : ${student.dob }</h3>
<h3>Student Courses is : ${student.courses }</h3>
<h3>Student Gender is : ${student.gender }</h3>
<h3>Student Type is : ${student.type }</h3>
<hr>
<h3>Student Address</h3>
<h3>Street : ${student.address.street }</h3>
<h3>City : ${student.address.city }</h3>
<h3>State : ${student.address.state }</h3>
<h3>Zip Code : ${student.address.zip }</h3>
</body>
</html>