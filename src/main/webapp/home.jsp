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
        <br />

        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">

            <c:forEach items="${events}" var="event">
                <div class="list-group">
                        <a href="#" data-toggle="modal" data-target="#modal${event.id}">
                            <c:if test="${empty event.image.url}">
                                <img src="images/defaultImage.png" />
                            </c:if>
                            <c:if test="${not empty event.image.url}">
                                <img src="${event.image.url}" />
                            </c:if>
                            <span class="event-list-date">Dec<br />12</span>
                            <span class="event-list-title">${event.title}</span>
                            <br />Majestic Theatre | Madison, WI
                        </a>
                </div>

                <div class="modal" id="modal${event.id}">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-body text-center">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <c:if test="${not empty event.image.medium.url}">
                                    <img src="${event.image.medium.url}" />
                                </c:if>
                                <h5>${event.title}</h5>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>

            </div> <div class="col-sm-1"></div>
        </div>
        <br />
    </div>

    <jsp:include page="footer.jsp" />

</body>
</html>