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
                    <c:choose>
                        <c:when test="${user.favoriteGenre.equals('rb')}">
                            <span id="favoriteGenre">R&B/Soul</span> music:
                        </c:when>
                        <c:when test="${user.favoriteGenre.equals('rap_hiphop')}">
                            <span id="favoriteGenre">rap/hip hop</span> music:
                        </c:when>
                        <c:otherwise>
                            <span id="favoriteGenre">${user.favoriteGenre}</span> music:
                        </c:otherwise>
                    </c:choose>
                </h4>
            </div>
        </div>
        <br />

        <jsp:include page="eventList.jsp" />
        <br />
    </div>

    <jsp:include page="footer.jsp" />

</body>
</html>