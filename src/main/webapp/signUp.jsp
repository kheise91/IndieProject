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

<div class="container">

    <div class="row">
        <div class="col-sm-12">
            <h1 class="text-center">ShowMe</h1>
            <hr /><br /><br />
        </div>
    </div>

    <div class="row">
        <div class="col-sm-4">
            <h5><i class="far fa-eye"></i>
                <br /><br />
                View upcoming concerts in your area based on your musical tastes
            </h5>
            <div id="v-divider-left"></div>
        </div>
        <div class="col-sm-4">
            <h5><i class="fas fa-calendar-check"></i>
                <br /><br />
                Keep track of the shows you plan on attending
            </h5>
        </div>
        <div class="col-sm-4">
            <div id="v-divider-right"></div>
            <h5><i class="fas fa-users"></i>
                <br /><br />
                Find link-minded individuals who are looking to share a ride to the show
            </h5>
        </div>
    </div>

    <a href="#signUp" id="signUpLink"><h3 class="text-center">Sign Up Today <i class="fas fa-caret-square-right"></i></h3></a>
</div>

<div class="container" id="signUp">
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8">
            <form class="row" action="signUp" method="POST">
                <h3 class="col-sm-12 text-center">Create Your Account</h3>
                <p class="col-sm-12 error-message">${errorMessage}</p>
                <div class="form-group col-sm-6">
                    <label for="firstName">*First Name:</label>
                    <input type="text" class="form-control form-control-lg" id="firstName" name="firstName" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="lastName">*Last Name:</label>
                    <input type="text" class="form-control form-control-lg" id="lastName" name="lastName" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="username">*Username:</label>
                    <input type="text" class="form-control form-control-lg" id="username" name="username" required="required" />
                </div>
                <div class="form-group col-sm-6">
                <label for="genre">*Favorite Genre:</label>
                <select class="form-control form-control-lg" id="genre" name="favoriteGenre">
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
                <div class="form-group col-sm-12">
                    <label for="email">*Email:</label>
                    <input type="text" class="form-control form-control-lg" id="email" name="email" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="zipCode">*Phone Number:</label>
                    <input type="text" class="form-control form-control-lg" id="phoneNumber" name="phoneNumber" placeholder=(###)###-#### required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="zipCode">*ZIP Code:</label>
                    <input type="text" class="form-control form-control-lg" id="zipCode" name="zipCode" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="password">*Password:</label>
                    <input type="password" class="form-control form-control-lg" id="password" name="password" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="passwordConfirm">*Confirm Password:</label>
                    <input type="password" class="form-control form-control-lg" id="passwordConfirm" name="passwordConfirm" required="required" />
                </div>
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-block submit-button" name="submit">Create Account</button>
                </div>
            </form>
        </div>
        <div class="col-sm-2"></div>
    </div>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
