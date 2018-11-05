<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Sign Up</title>
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

    <!-- Custom CSS and JavaScript -->
    <link rel="stylesheet" href="css/showMe.css" />
</head>

<body style="background-image: url('images/showMeBackground.jpg');">
<jsp:include page="indexNavbar.jsp" />

<div class="container">
    <div class="col-6 signUpDiv">
        <h1 class="text-center">ShowMe</h1>
        <p>What if there was one place you could go to view upcoming concerts in your are, based on your musical tastes?
           ShowMe will do just that. ShowMe will also keep track of any previous shows that you've attended, making it easy
           to remember the great times you had.
        </p>
    </div>

    <div class="col-6 signUpDiv">
        <form>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" class="form-control" id="username" />
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" />
            </div>
        </form>
    </div>
</div>

</body>
</html>
