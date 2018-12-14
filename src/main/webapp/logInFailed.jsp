<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Sign In</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/signUpLogIn.css" />
</head>

<body>

<div class="bg-img"></div>
<jsp:include page="indexNavbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6 main-section">
            <form class="signUpLogInForm" action="j_security_check" method="POST">
                <h4 class="text-center">Sign In</h4>
                <p class="error-message text-center">*Invalid Username/Password</p>
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
        <div class="col-sm-3"></div>
    </div>
</div>

</body>
</html>