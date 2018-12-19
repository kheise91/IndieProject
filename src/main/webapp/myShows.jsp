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

    <jsp:include page="eventList.jsp" />
</div>

<jsp:include page="footer.jsp" />
</body>
</html>

<script type="text/javascript">
    $(".success-message").delay(3000).hide(500);
</script>