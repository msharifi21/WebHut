<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebHut </title>
</head>

<style>
    h1 {text-align: center;}
    p {text-align: center;}
</style>

<body>
    <h1> My Contact Info </h1>
    <br/>
    <table align="center" border="1" cellpadding="10">
        <tr>
            <th>First Name</th><th>Last Name</th><th>Email</th><th>Phone Number</th>
        </tr>
        <c:forEach var="contact" items="${contacts}">
        <tr>
            <td>${contact.fname}</td>
            <td>${contact.lname}</td>
            <td>${contact.email}</td>
            <td>${contact.phoneNum}</td>
        </tr>    
        </c:forEach>
    </table>
    <p>
        <a href="index.html">Home </a> 
    </p>
    
</body>

</html>