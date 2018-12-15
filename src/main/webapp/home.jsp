<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>ShowMe</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/home.css" />
</head>

<body>
    <jsp:include page="userNavbar.jsp" />
    <div class="bg-img"></div>

    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <h1 class="display-4">Hello ${user.firstName}!</h1>
                <br />
                <h4>Here are some upcoming concerts near your area based on your interest in
                    <span id="favoriteGenre">${user.favoriteGenre}</span> music:</h4>
            </div>
        </div>
    </div>

    <jsp:include page="footer.jsp" />

</body>
</html>