<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Page</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

.container {
    max-width: 600px;
    margin: 20px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

h2 {
    text-align: center;
    margin-bottom: 20px;
}

form {
    display: grid;
    gap: 10px;
}

label {
    font-weight: bold;
}

input[type="text"],
input[type="date"] {
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    width: 100%;
}

input[type="submit"] {
    padding: 10px;
    border: none;
    border-radius: 5px;
    background-color: #007bff;
    color: #fff;
    cursor: pointer;
    width: 100%;
}

input[type="submit"]:hover {
    background-color: #0056b3;
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
<h2>Welcome ${user}</h2>
<div class="container">
<form action="submit-add-data">
Enter Loanee Name :<input type="text" name="loanee" placeholder="Enter Loanee Name"/>
Enter description :<input type="text" name="desc" placeholder="Enter description"/>
Enter Mobile No :<input type="text" name="mobile" placeholder="Enter Mobile No"/>
Enter Disbrustment Date :<input type="date" name="disbDate" />
Enter Next Due Date :<input type="date" name="nextDueDate"/>
<input type="submit" value="Add Data"/>
</form>
</div>
</body>
</html>
