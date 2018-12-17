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
        <div class="col-sm-12">

            <div class="profile-card">
                <div class="profile-card-header">
                    <h1>Username</h1>
                    <img src="images/defaultImage.png" />
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>