<%@ include file="./common/header.jspf" %>
<title>Edit Loan</title>
    <style>
        h2 {
            text-align: center;
            color: #007bff;
        }
    </style>
</head>
<%@ include file="./common/navbar.jspf" %>
<body>
<h2>Update Credentials</h2>
<form action="updateLoan" class="container">
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
<%@ include file="./common/footer.jspf"%>