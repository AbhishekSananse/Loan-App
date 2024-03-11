<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>   
    <meta charset="UTF-8">
    <title>Edit Loan</title>
    <style>
        /* Custom form styles */
        .form-container {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            background-color: #f9f9f9;
        }

        /* Custom form header styles */
        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
    </style>
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
<body>
    <div class="form-container">
        <h1>Edit Loan</h1>
        <form action="updateLoan" class="row g-3">
            <div class="mb-3">
                <label for="loanId" class="form-label">Loan ID:</label>
                <input type="text" id="loanId" name="loanId" value="${lb.loanId}" class="form-control" readonly>
            </div>
            <div class="mb-3">
                <label for="loanee" class="form-label">Loanee:</label>
                <input type="text" id="loanee" name="loanee" value="${lb.loanee}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="description" class="form-label">Description:</label>
                <input type="text" id="description" name="description" value="${lb.description}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="mobileNo" class="form-label">Mobile No:</label>
                <input type="text" id="mobileNo" name="mobileNo" value="${lb.mobileNo}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="disbDate" class="form-label">Disbursal Date:</label>
                <input type="date" id="disbDate" name="disbDate" value="${lb.disbDate}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="nextDueDate" class="form-label">Next Due Date:</label>
                <input type="date" id="nextDueDate" name="nextDueDate" value="${lb.nextDueDate}" class="form-control">
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">Save</button>
            </div>
        </form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
