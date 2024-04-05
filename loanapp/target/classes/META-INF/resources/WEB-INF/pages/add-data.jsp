<%@ include file="./common/header.jspf" %>
<title>Add Page</title>
</head>
<%@ include file="./common/navbar.jspf" %>
<body>
<h2 align=center style="color:#007bff">Add New Loanee</h2>
<div class="container">
    <form action="submit-add-data" class="mt-5">
        <div class="mb-3">
            <label for="loanee" class="form-label">Enter Loanee Name :</label>
            <input type="text" class="form-control" id="loanee" name="loanee" placeholder="Enter Loanee Name">
        </div>
        <div class="mb-3">
            <label for="desc" class="form-label">Enter description :</label>
            <input type="text" class="form-control" id="desc" name="desc" placeholder="Enter description">
        </div>
        <div class="mb-3">
            <label for="mobile" class="form-label">Enter Mobile No :</label>
            <input type="text" class="form-control" id="mobile" name="mobile" placeholder="Enter Mobile No">
        </div>
        <div class="mb-3">
            <label for="disbDate" class="form-label">Enter Disbursement Date :</label>
            <input type="date" class="form-control" id="disbDate" name="disbDate">
        </div>
        <div class="mb-3">
            <label for="nextDueDate" class="form-label">Enter Next Due Date :</label>
            <input type="date" class="form-control" id="nextDueDate" name="nextDueDate">
        </div>
        <button type="submit" class="btn btn-primary">Add Data</button>
    </form>
</div>
<%@ include file="./common/footer.jspf"%>