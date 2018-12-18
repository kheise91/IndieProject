<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>ShowMe - Search</title>

    <jsp:include page="headTags.jsp" />

    <link rel="stylesheet" href="css/search.css" />
</head>

<body>
<jsp:include page="userNavbar.jsp" />
<div class="bg-img"></div>

    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <h1>Search for a show by genre and distance:</h1>
                <form class="form-inline justify-content-center" action="search" method="GET">
                    <select id="genre" name="genre" class="form-control form-control-lg">
                        <option value="xxx" disabled selected>Choose Genre...</option>
                        <option value="blues">Blues</option>
                        <option value="classical">Classical</option>
                        <option value="country">Country</option>
                        <option value="dance">Dance</option>
                        <option value="electronic">Electronic</option>
                        <option value="folk">Folk</option>
                        <option value="jazz">Jazz</option>
                        <option value="latin">Latin</option>
                        <option value="opera">Opera</option>
                        <option value="rb">R&B/Soul</option>
                        <option value="reggae">Reggae</option>
                        <option value="rap_hiphop">Hip Hop/Rap</option>
                        <option value="metal">Heavy Metal</option>
                        <option value="inspirational">Inspirational</option>
                        <option value="rock">Rock</option>
                        <option value="pop">Pop</option>
                        <option value="alternative">Alternative</option>
                    </select>
                    <label>within</label>
                    <select id="distance" name="distance" class="form-control form-control-lg">
                        <option value="xxx" disabled selected>Choose Distance...</option>
                        <option value="25">25 miles of</option>
                        <option value="50">50 miles of</option>
                        <option value="100">100 miles of</option>
                        <option value="200">200 miles of</option>
                    </select>
                    <input type="text" id="zipCode" class="form-control form-control-lg" name="zipCode" placeholder="Zip Code" required="required" />
                    <input type="submit" name="submit" class="btn btn-lg" value="Search" />
                </form>
            </div>
        </div>

        <jsp:include page="eventList.jsp" />

    </div>

<jsp:include page="footer.jsp" />
</body>
</html>