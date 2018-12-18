<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            </c:when>

            <c:otherwise></c:otherwise>
        </c:choose>

    </div>
</div>