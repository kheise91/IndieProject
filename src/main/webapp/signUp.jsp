<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Sign Up</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/signUpLogIn.css" />
</head>

<body>

<jsp:include page="indexNavbar.jsp" />
<div class="bg-img"></div>

<div class="container main-section">
    <div class="row">
        <div class="col-sm-6">
            <div id="infoDiv">
                <h1 class="text-center">ShowMe</h1>
                <hr /><br />

                <h5>What if there was one place you could go to view upcoming concerts in your area, based on your
                    musical tastes? ShowMe will do just that.
                    <br /><br />
                    ShowMe will also keep track of any previous shows that you've attended, making it easy to
                    remember the great times you had.
                </h5>
                <br /><br /><br />

                <h4 class="text-center">Sign Up Today <i class="fas fa-caret-square-right"></i></h4>
            </div>
        </div>

        <div class="col-sm-1"><div id="divider"></div></div>

        <div class="col-sm-5">
            <form action="signUp" method="POST">
                <p class="error-message">${errorMessage}</p>
                <div class="form-group">
                    <label for="username">*Username:</label>
                    <input type="text" class="form-control" id="username" name="username" required="required" />
                </div>
                <div class="form-group">
                    <label for="email">*Email:</label>
                    <input type="text" class="form-control" id="email" name="email" required="required" />
                </div>
                <div class="form-group">
                    <label for="password">*Password:</label>
                    <input type="password" class="form-control" id="password" name="password" required="required" />
                </div>
                <div class="form-group">
                    <label for="passwordConfirm">*Confirm Password:</label>
                    <input type="password" class="form-control" id="passwordConfirm" name="passwordConfirm" required="required" />
                </div>
                <div class="form-group">
                    <label for="zipCode">*ZIP Code:</label>
                    <input type="text" class="form-control" id="zipCode" name="zipCode" required="required" />
                </div>
                <div class="form-group">
                    <label for="genre">*Favorite Genre:</label>
                    <select class="form-control" id="genre" name="favoriteGenre">
                        <option value="none">(Choose Genre)</option>
                        <option value="blues">Blues</option>
                        <option value="classical">Classical</option>
                        <option value="country">Country</option>
                        <option value="dance">Dance</option>
                        <option value="electronic">Electronic</option>
                        <option value="folk">Folk</option>
                        <option value="jazz">Jazz</option>
                        <option value="latin">Latin</option>
                        <option value="opera">Opera</option>
                        <option value="rb">R&B/Soul</option>
                        <option value="reggae">Reggae</option>
                        <option value="rap_hiphop">Hip Hop/Rap</option>
                        <option value="metal">Heavy Metal</option>
                        <option value="inspirational">Inspirational</option>
                        <option value="rock">Rock</option>
                        <option value="pop">Pop</option>
                        <option value="alternative">Alternative</option>
                    </select>
                </div>
                <br />
                <button type="submit" class="btn btn-block submit-button" name="submit">Create Account</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
