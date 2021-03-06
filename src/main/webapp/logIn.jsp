<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Sign In</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/signUpLogIn.css" />
</head>

<body>

<jsp:include page="indexNavbar.jsp" />
<div class="bg-img"></div>

<div class="container">
    <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <form class="signUpLogInForm" action="j_security_check" method="POST">
                <h3 class="text-center">Sign In</h3>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control form-control-lg" id="username" name="j_username" required="required" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control form-control-lg" id="password" name="j_password" required="required" />
                </div>
                <br />

                <button type="submit" class="btn btn-block submit-button">Sign In</button>
                <br />

                <p>Don't have an account?
                    <br />
                    <a href="signUp.jsp">Sign up here</a>
                </p>
            </form>
        </div>
        <div class="col-sm-4"></div>
    </div>
</div>

</body>
</html>