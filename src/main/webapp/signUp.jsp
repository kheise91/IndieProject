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

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <!-- Custom CSS and JavaScript -->
    <link rel="stylesheet" href="css/showMe.css" />
</head>

<body style="background-image: url('images/showMeBackground.jpg');">
    <jsp:include page="indexNavbar.jsp" />

    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <section>
                    <h1 class="text-center display-4 showMeTitle">ShowMe</h1>
                    <hr /><br />

                    <h5>What if there was one place you could go to view upcoming concerts in your area, based on your
                        musical tastes? ShowMe will do just that.
                        <br /><br />
                        ShowMe will also keep track of any previous shows that you've attended, making it easy to
                        remember the great times you had.
                    </h5>
                </section>
            </div>

            <div class="col-sm-1"></div>

            <div class="col-sm-4">
                <form class="signUpLogInForm">
                    <div class="form-group">
                        <label for="username">Username:</label>
                        <input type="text" class="form-control" id="username" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="text" class="form-control" id="email" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" class="form-control" id="password" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="passwordConfirm">Confirm Password:</label>
                        <input type="password" class="form-control" id="passwordConfirm" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="zipCode">ZIP Code:</label>
                        <input type="text" class="form-control" id="zipCode" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="genre">Favorite Genre:</label>
                        <select class="form-control" id="genre">
                            <option value="none">(Choose Genre)</option>
                            <option value="Rock">Rock</option>
                            <option value="Electronic">Electronic</option>
                            <option value="Pop">Pop</option>
                            <option value="Alternative">Alternative</option>
                            <option value="Folk">Folk</option>
                            <option value="Hip Hop">Hip Hop</option>
                            <option value="Punk">Punk</option>
                            <option value="R&B/Soul">R&B/Soul</option>
                            <option value="Country">Country</option>
                            <option value="Jazz">Jazz</option>
                            <option value="Reggae">Reggae</option>
                            <option value="Blues">Blues</option>
                            <option value="Metal">Metal</option>
                            <option value="Latin">Latin</option>
                            <option value="Christian/Gospel">Christian/Gospel</option>
                            <option value="Classical">Classical</option>
                        </select>
                    </div>
                    <br />
                    <button type="submit" id="submitButton">Create Account</button>
                </form>
            </div>

            <div class="col-sm-1"></div>
        </div>
    </div>

</body>
</html>
