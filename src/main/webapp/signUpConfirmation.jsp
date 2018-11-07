<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Log In</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta charset="UTF-8" />

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <!-- Custom CSS and JavaScript -->
    <link rel="stylesheet" href="css/showMe.css" />
</head>

<body style="background-image: url('images/showMeBackground.jpg');">
<jsp:include page="indexNavbar.jsp" />

<div class="container">
    <div class="row">

        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <h1 class="text-center display-4 showMeTitle">ShowMe</h1>
            <hr /><br />
        </div>
        <div class="col-sm-3"></div>

        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <form class="signUpLogInForm" action="j_security_check" method="POST">
                <h2 class="text-center">Log In</h2>
                <p class="successMessage text-center">*Account Successfully Created</p>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control" id="username" name="j_username" required="required" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" name="j_password" required="required" />
                </div>
                <br />

                <button type="submit" id="submitButton">Log In</button>
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