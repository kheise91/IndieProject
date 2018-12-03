<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Sign Up</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/signUp.css" />
</head>

<body>

    <div class="bg-img"></div>
    <jsp:include page="indexNavbar.jsp" />

    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <section>
                    <h1 class="text-center">ShowMe</h1>
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
                <form action="signUpUser" method="POST">
                    <div class="form-group">
                        <label for="username">Username:</label>
                        <input type="text" class="form-control" id="username" name="username" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="text" class="form-control" id="email" name="email" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" class="form-control" id="password" name="password" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="passwordConfirm">Confirm Password:</label>
                        <input type="password" class="form-control" id="passwordConfirm" name="passwordConfirm" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="zipCode">ZIP Code:</label>
                        <input type="text" class="form-control" id="zipCode" name="zipCode" required="required" />
                    </div>
                    <div class="form-group">
                        <label for="genre">Favorite Genre:</label>
                        <select class="form-control" id="genre" name="favoriteGenre">
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
                    <button type="submit" id="submitButton" name="submit">Create Account</button>
                </form>
            </div>

            <div class="col-sm-1"></div>
        </div>
    </div>

<br /><br />
</body>
</html>
