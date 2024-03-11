<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- integrating the Bootstrap -->
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>List Data</title>
</head>
<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
	<a class="navbar-brand m-1" href="#">Spring Boot</a>
	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/getlist">Loan List</a></li>
		</ul>
	</div>
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="/login">Logout</a></li>
	</ul>	
</nav>
<body >
    <h1 align="center">Loan List</h1>
    <hr>
    <div class="container">
    <table class="table table-striped">
        <tr>
            <th>Loan ID</th>
            <th>Loanee</th>
            <th>Description</th>
            <th>Mobile No</th>
            <th>Disbursal Date</th>
            <th>Next Due Date</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="l" items="${list}">
            <tr>
                <td>${l.loanId}</td>
                <td>${l.loanee}</td>
                <td>${l.description}</td>
                <td>${l.mobileNo}</td>
                <td>${l.disbDate}</td>
                <td>${l.nextDueDate}</td>
                <td><a href="editLoan?loanId=${l.loanId}"><button class="btn btn-secondary">Edit</button></a></td>
                <td><a href="deleteLoan?loanId=${l.loanId}"><button class="btn btn-danger">Delete</button></a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="add-data" ><button class="btn btn-success">Add Data</button></a>
    </div>
        
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
</body>
</html>
