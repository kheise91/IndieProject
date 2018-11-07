<nav class="navbar navbar-expand-md">
    <!-- Brand -->
    <a class="navbar-brand" href="home.jsp">ShowMe</a>

    <!-- Toggler/collapsibe Button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="fas fa-bars"></span>
    </button>

    <!-- Navbar links -->
    <div class="collapse navbar-collapse justify-content-end" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">My Shows</a>
            </li>
            &nbsp;&nbsp;
            <li class="nav-item">
                <a class="nav-link" href="#">Friends</a>
            </li>
            &nbsp;&nbsp;
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"><% out.print(request.getRemoteUser()); %>&nbsp;<span class="far fa-user"></span></a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="#">Edit Profile</a>
                    <a class="dropdown-item" href="logOut.jsp">Log Out</a>
                </div>
            </li>
        </ul>
    </div>
</nav>