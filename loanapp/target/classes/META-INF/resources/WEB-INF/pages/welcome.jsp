<%@ include file="./common/header.jspf" %>
<title>Welcome Page</title>
<style>
    .welcome-message {
        text-align: center;
        font-size: 30px;
        margin-top: 20px;
        color: #007bff;
    }
</style>
</head>
<%@ include file="./common/navbar.jspf" %>
<body >
<h1 class="welcome-message">Welcome ${user}</h1>
<%@ include file="./common/footer.jspf"%>