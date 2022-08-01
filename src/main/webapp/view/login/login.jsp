<%--
  Created by IntelliJ IDEA.
  User: jl
  Date: 7/29/2022
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../fragment/head.jsp"/>
<body>
<div class="row">
    <div class="col-6 offset-3">
        <form method="post">
            <h1 style="align-content: center">sig in</h1>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="John Doe">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Password">
            </div>
            <button type="submit" class="btn btn-success">OK</button>
            <a href="/SingUp" class="btn btn-primary">Register</a>
        </form>
    </div>
</div>
<jsp:include page="../fragment/js.jsp"/>
</body>
</html>
