<%--
  Created by IntelliJ IDEA.
  User: muhammad
  Date: 30/07/2022
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <jsp:include page="../fragment/head.jsp"/>
</head>
<body>
<jsp:include page="../fragment/js.jsp"/>
<div class="row">
    <div class="col-6 offset-3">
        <form method="post">
            <h2 style="color: black; align-content: center">Sign up</h2>
            <div class="form-group">
                <label for="username">Usernamenn</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="John Doe">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password1" placeholder="Password">
            </div>
            <div class="form-group">
                <label for="password">Repeat Password</label>
                <input type="password" class="form-control" id="password2" name="password2" placeholder="Password">
            </div>
            <button type="submit" class="btn btn-success">OK</button>
            <a href="/" class="btn btn-primary">Login</a>
        </form>
    </div>
</div>


</body>
</html>
