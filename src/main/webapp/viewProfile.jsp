<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - View Profile</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/viewProfile.css" />
</head>

<body>
<jsp:include page="userNavbar.jsp" />
<div class="bg-img"></div>

<div class="container">
    <div class="row">
        <div class="col-sm-12" style="padding:0em;">

            <div class="profile-card">
                <div class="profile-card-header">
                    <h1>${profile.username.toUpperCase()} (${profile.emailAddress})</h1>
                    <img src="images/defaultImage.png" />

                    <form id="updateRideShare" action="toggleRideShare" method="post">
                        <c:choose>
                            <c:when test="${user.rideShare.equals('Y')}">
                                <input type="hidden" name="action" value="on" />
                                <label class="switch" title="Enabling Ride Share will allow you to receive SMS notifications to your phone.">
                                    <input type="checkbox" checked="checked" />
                                    <span class="slider round"></span>
                                </label>
                            </c:when>
                            <c:otherwise>
                                <input type="hidden" name="action" value="off" />
                                <label class="switch" title="Enabling Ride Share will allow you to receive SMS notifications to your phone.">
                                    <input type="checkbox" />
                                    <span class="slider round"></span>
                                </label>
                            </c:otherwise>
                        </c:choose>
                    </form>

                </div>

                <div class="profile-card-info">
                    <h5>First Name:</h5><p>${profile.firstName}</p>
                    <h5>Last Name:</h5><p>${profile.lastName}</p>
                    <h5>Age:</h5><p>${profile.getAge()}</p>
                    <h5>Location:</h5><p>${profile.city} ${profile.state}, ${profile.zipCode}</p>
                    <h5>Favorite Genre:</h5><p>${profile.favoriteGenre} music</p>
                </div>

                <div class="profile-card-shows">
                    <h3>${profile.firstName}'s Shows</h3>
                </div>
            </div>

        </div>
    </div>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>

<script type="text/javascript">
    $('.switch').on('click', function() {
        setTimeout(function() {
            $("#updateRideShare").submit();
        }, 1000);
    });
</script>