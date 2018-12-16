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
                    <c:when test="${user.favoriteGenre.equals('rb')}">
                        <span id="favoriteGenre">R&B/Soul</span> music:
                    </c:when>
                    <c:when test="${user.favoriteGenre.equals('rap_hiphop')}">
                        <span id="favoriteGenre">rap/hip hop</span> music:
                    </c:when>
                    <c:otherwise>
                        <span id="favoriteGenre">${user.favoriteGenre}</span> music:
                    </c:otherwise>
                </h4>
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
                            <span class="event-list-date">${event.startTime.format(monthFormatter)}<br />
                                                          ${event.startTime.format(dayFormatter)}</span>
                            <span class="event-list-title">${event.title}</span>
                            <br />${event.venueName} &nbsp;|&nbsp; ${event.cityName}, ${event.regionAbbr}
                        </a>
                </div>

                <div class="modal" id="modal${event.id}">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">
                            <div class="modal-body">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <c:if test="${empty event.image.medium.url}">
                                    <img src="images/defaultImage.png" />
                                </c:if>
                                <c:if test="${not empty event.image.medium.url}">
                                    <img src="${event.image.medium.url}" />
                                </c:if>
                                <a href="${event.url}" target="_blank"><h5>${event.title}</h5></a>
                                <br /><hr />
                                <p class="event-date-time">
                                    <i class="far fa-calendar-alt"></i>
                                    <br />
                                        ${event.startTime.format(dateFormatter)}
                                    <br /><br />
                                    <i class="far fa-clock"></i>
                                    <br />
                                        ${event.startTime.format(timeFormatter)}
                                </p>
                                <div class="v-divider"></div>
                                <p class="event-location">
                                    <i class="fas fa-map-marker-alt"></i>
                                    <br />
                                    <a href="${event.venueUrl}" target="_blank">${event.venueName}</a>
                                    <br />
                                    ${event.venueAddress}
                                    <br />
                                    ${event.cityName}, ${event.regionAbbr} ${event.postalCode}
                                </p>
                                <div class="h-divider"></div>
                                <a href="#" class="add-remove-show">Add To My Shows</a>
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