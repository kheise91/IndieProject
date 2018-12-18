<!DOCTYPE html>

<html>
<head>
    <title>ShowMe</title>

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
    <link rel="stylesheet" href="css/menu.css" />
    <script src="js/menu.js" charset="UTF-8"></script>
    <link rel="stylesheet" href="css/index.css" />
    <script src="js/index.js" charset="UTF-8"></script>
</head>

<body>

    <div class="bg-img"></div>
    <jsp:include page="indexNavbar.jsp" />

    <div class="container text-center">
        <div class="headingDiv">
            <h1>Music is Life</h1>
            <h2>See it Live</h2>
        </div>

        <a href="signUp.jsp" class="btn" id="showMe">Show Me</a>
    </div>

</body>
</html>
