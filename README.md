# [ShowMe](http://18.218.13.172:8080/ShowMe/)

This repository is for my Indie Project (ShowMe)

## [ShowMe Demo - Part 1](https://youtu.be/s808aNiFkUs)
## [ShowMe Demo - Part 2](https://youtu.be/ysslM17fKkM)
### Problem Statement

What if there was only one place you had to go to view upcoming concerts in your area, based on your musical tastes? ShowMe will do just that. ShowMe will aslo keep track of any previous shows that you've attended, making it easy to view photos to remind you of the great times you had.

Sometimes it can be difficult making plans with others. ShowMe will also allow you to see who else in your area will be attending the show you want to go to, and if they are interested in carpooling. This way, you'll never have to worry about missing a concert because you had nobody to go with. 

### Project Technologies/Techniques

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * User role: bookmark shows, view past shows, edit profile, view other profiles
  * All: view upcoming shows
* Database
  * MySQL
  * Store users and roles
  * Store user's favorite genre and previous shows
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services
  * EventFul API
* Independent Research Topic
  * Amazon AWS SNS
* CSS
  * Bootstrap
* Hosting
  * AWS
* Logging
  * Log4J2
* Unit Testing
  * JUnit
* IDE: IntelliJ IDEA

### Design

* [Screen Design](DesignDocuments/ScreenDesign.md)
* [Application Flow](DesignDocuments/ApplicationFlow.md)
* [Database Design](DesignDocuments/ConcertFinderDatabase.png)

### [Project Plan](ProjectPlan.md)

### [Project Time Log](TimeLog.md)
