<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - My Shows</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/myShows.css" />
</head>

<body>
<jsp:include page="userNavbar.jsp" />
<div class="bg-img"></div>

<div class="container">
    <div class="row">
        <div class="col-sm-12">

            <c:if test="${not empty updateMessage}">
                <div class="success-message">${updateMessage}</div>
            </c:if>

            <h1>My Shows: </h1>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-12">

            <c:choose>
                <c:when test="${not empty errorMessage}">
                    <p class="error-message">${errorMessage}</p>
                </c:when>

                <c:when test="${not empty events}">
                    <c:forEach items="${events}" var="event">
                        <div class="list-group">
                            <a href="#" data-toggle="modal" data-target="#modal${event.id}">
                                <c:if test="${event.images.image.get(0).url}">
                                    <img src="images/defaultImage.png" />
                                </c:if>
                                <c:if test="${not empty event.images.image.get(0).url}">
                                    <img src="${event.images.image.get(0).url}" />
                                </c:if>
                                <span class="event-list-date">${event.startTime.format(monthFormatter)}<br />
                                        ${event.startTime.format(dayFormatter)}</span>
                                <span class="event-list-title">${event.title}</span>
                                <br />${event.venueName} &nbsp;|&nbsp; ${event.city}, ${event.regionAbbr}
                            </a>
                        </div>

                        <div class="modal" id="modal${event.id}">
                            <div class="modal-dialog modal-lg">
                                <div class="modal-content">
                                    <div class="modal-body">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <c:if test="${empty event.images.image.get(0).getMedium().url}">
                                            <img src="images/defaultImage.png" />
                                        </c:if>
                                        <c:if test="${not empty event.images.image.get(0).getMedium().url}">
                                            <img src="${empty event.images.image.get(0).getMedium().url}" />
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
                                                ${event.venueName}
                                            <br />
                                                ${event.address}
                                            <br />
                                                ${event.city}, ${event.regionAbbr} ${event.postalCode}
                                        </p>
                                        <div class="h-divider"></div>

                                        <form action="addRemoveShow" method="post">
                                            <input type="hidden" name="action" value="remove" />
                                            <input type="hidden" name="showId" value="${event.id}" />
                                            <input type="submit" name="addRemoveSubmit" class="add-remove-show" value="Remove From My Shows" />
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </c:when>

                <c:otherwise></c:otherwise>
            </c:choose>

        </div>
    </div>
</div>

<jsp:include page="footer.jsp" />
</body>
</html>

<script type="text/javascript">
    $(".success-message").delay(3000).hide(500);
</script>