<%@ include file="./common/header.jspf" %>
<title>Login Page</title>
</head>
<body>
    <div class="container mt-5">
        <h1>Login</h1>
        <form action="loginsubmit" >
            <div class="mb-3">
                <label for="userid" class="form-label">User Id:</label>
                <input type="text" class="form-control" id="userid" name="userid" placeholder="Enter User Id">
            </div>
            <div class="mb-3">
                <label for="pass" class="form-label">User Password:</label>
                <input type="password" class="form-control" id="pass" name="pass" placeholder="Enter User Password">
            </div>
            <div class="mb-3">
                <div class="text-danger">${msg}</div>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
<%@ include file="./common/footer.jspf"%>