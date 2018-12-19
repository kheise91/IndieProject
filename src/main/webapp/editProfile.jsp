<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Edit Profile</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/editProfile.css" />
</head>

<body>
<jsp:include page="userNavbar.jsp" />
<div class="bg-img"></div>

<div class="container">
    <div class="row">

        <div class="col-sm-12 text-center">
            <h3>Edit your profile</h3>
            <p class="col-sm-12 error-message">${errorMessage}</p>
        </div>

        <div class="col-sm-12">
            <form action="updateUser" class="row" method="POST">

                <div class="form-group col-sm-6">
                    <label for="firstName">*First Name:</label>
                    <input type="text" class="form-control form-control-lg" id="firstName" name="firstName" value="${user.firstName}" required="required" />
                </div>
                <div class="form-group col-sm-6">
                    <label for="lastName">*Last Name:</label>
                    <input type="text" class="form-control form-control-lg" id="lastName" name="lastName" value="${user.lastName}" required="required" />
                </div>


                <div class="form-group col-sm-6">
                    <label for="email">*Email:</label>
                    <input type="text" class="form-control form-control-lg" id="email" name="email" value="${user.emailAddress}" required="required" />
                </div>

                <div class="form-group col-sm-6">
                    <label for="phoneNumber">*Phone Number:</label>
                    <input type="text" class="form-control form-control-lg" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber.substring(2)}" placeholder=(###)###-#### required="required" />
                </div>

                <div class="form-group col-sm-6">
                    <label for="genre">*Favorite Genre:</label>
                    <select class="form-control form-control-lg" id="genre" name="favoriteGenre">
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
                <div class="form-group col-sm-6">
                    <label for="birthdate">*BirthDate:</label>
                    <input type="date" class="form-control form-control-lg" id="birthdate" name="birthdate" value="${user.birthdate}" required="required" />
                </div>

                <div class="form-group col-sm-6">
                    <label for="city">*City:</label>
                    <input type="text" class="form-control form-control-lg" id="city" name="city" value="${user.city}" required="required" />
                </div>
                <div class="form-group col-sm-2">
                    <label for="state">*State:</label>
                    <select class="form-control form-control-lg" id="state" name="state">
                        <option value="AL">AL</option>
                        <option value="AK">AK</option>
                        <option value="AR">AR</option>
                        <option value="AZ">AZ</option>
                        <option value="CA">CA</option>
                        <option value="CO">CO</option>
                        <option value="CT">CT</option>
                        <option value="DC">DC</option>
                        <option value="DE">DE</option>
                        <option value="FL">FL</option>
                        <option value="GA">GA</option>
                        <option value="HI">HI</option>
                        <option value="IA">IA</option>
                        <option value="ID">ID</option>
                        <option value="IL">IL</option>
                        <option value="IN">IN</option>
                        <option value="KS">KS</option>
                        <option value="KY">KY</option>
                        <option value="LA">LA</option>
                        <option value="MA">MA</option>
                        <option value="MD">MD</option>
                        <option value="ME">ME</option>
                        <option value="MI">MI</option>
                        <option value="MN">MN</option>
                        <option value="MO">MO</option>
                        <option value="MS">MS</option>
                        <option value="MT">MT</option>
                        <option value="NC">NC</option>
                        <option value="NE">NE</option>
                        <option value="NH">NH</option>
                        <option value="NJ">NJ</option>
                        <option value="NM">NM</option>
                        <option value="NV">NV</option>
                        <option value="NY">NY</option>
                        <option value="ND">ND</option>
                        <option value="OH">OH</option>
                        <option value="OK">OK</option>
                        <option value="OR">OR</option>
                        <option value="PA">PA</option>
                        <option value="RI">RI</option>
                        <option value="SC">SC</option>
                        <option value="SD">SD</option>
                        <option value="TN">TN</option>
                        <option value="TX">TX</option>
                        <option value="UT">UT</option>
                        <option value="VT">VT</option>
                        <option value="VA">VA</option>
                        <option value="WA">WA</option>
                        <option value="WI">WI</option>
                        <option value="WV">WV</option>
                        <option value="WY">WY</option>
                    </select>
                </div>
                <div class="form-group col-sm-4">
                    <label for="zipCode">*ZIP Code:</label>
                    <input type="text" class="form-control form-control-lg" id="zipCode" name="zipCode" value="${user.zipCode}" required="required" />
                </div>

                <div class="col-sm-12">
                    <input type="submit" class="btn btn-block" name="editProfileSubmit" value="Save Changes" />
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp" />

<script type="text/javascript">
    $("#genre").val("${user.favoriteGenre}");
    $("#state").val("${user.state}");
</script>
</body>
</html>