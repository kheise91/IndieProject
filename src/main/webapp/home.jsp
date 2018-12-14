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

    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <h1 class="text-center">Welcome ${user}</h1>
                <hr />
            </div>
        </div>
    </div>

</body>
</html>