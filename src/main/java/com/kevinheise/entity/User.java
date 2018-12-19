package com.kevinheise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type User.
 */
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String username;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String city;

    private String state;

    private LocalDate birthdate;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "favorite_genre")
    private String favoriteGenre;

    @Column(name = "ride_share")
    private String rideShare;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Shows> shows = new HashSet<>();

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param username      the username
     * @param password      the password
     * @param firstName     the first name
     * @param lastName      the last name
     * @param emailAddress  the email address
     * @param phoneNumber   the phone number
     * @param city          the city
     * @param state         the state
     * @param birthdate     the birthdate
     * @param zipCode       the zip code
     * @param favoriteGenre the favorite genre
     * @param rideShare     the ride share
     */
    public User(String username, String password, String firstName, String lastName, String emailAddress, String phoneNumber, String city, String state, LocalDate birthdate, String zipCode, String favoriteGenre, String rideShare) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.birthdate = birthdate;
        this.zipCode = zipCode;
        this.favoriteGenre = favoriteGenre;
        this.rideShare = rideShare;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets email address.
     *
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets email address.
     *
     * @param emailAddress the email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets birthdate.
     *
     * @return the birthdate
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets birthdate.
     *
     * @param birthdate the birthdate
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets zip code.
     *
     * @return the zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets zip code.
     *
     * @param zipCode the zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Gets favorite genre.
     *
     * @return the favorite genre
     */
    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    /**
     * Sets favorite genre.
     *
     * @param favoriteGenre the favorite genre
     */
    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

    /**
     * Gets ride share.
     *
     * @return the ride share
     */
    public String getRideShare() {
        return rideShare;
    }

    /**
     * Sets ride share.
     *
     * @param rideShare the ride share
     */
    public void setRideShare(String rideShare) {
        this.rideShare = rideShare;
    }

    /**
     * Gets roles.
     *
     * @return the roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * Gets shows.
     *
     * @return the shows
     */
    public Set<Shows> getShows() {
        return shows;
    }

    /**
     * Sets shows.
     *
     * @param shows the shows
     */
    public void setShows(Set<Shows> shows) {
        this.shows = shows;
    }

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        roles.add(role);
    }

    /**
     * Remove role.
     *
     * @param role the role
     */
    public void removeRole(Role role) {
        roles.remove(role);
        role.setUser(null);
    }

    /**
     * Add show.
     *
     * @param show the show
     */
    public void addShow(Shows show) {
        shows.add(show);
    }

    /**
     * Remove show.
     *
     * @param show the show
     */
    public void removeShow(Shows show) {
        shows.remove(show);
        show.setUser(null);
    }

    /**
     * Get age int.
     *
     * @return the int
     */
    public int getAge(){
        return (int) ChronoUnit.YEARS.between(birthdate, LocalDate.now());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", birthdate=" + birthdate +
                ", zipCode='" + zipCode + '\'' +
                ", favoriteGenre='" + favoriteGenre + '\'' +
                ", rideShare='" + rideShare + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(emailAddress, user.emailAddress) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(city, user.city) &&
                Objects.equals(state, user.state) &&
                Objects.equals(birthdate, user.birthdate) &&
                Objects.equals(zipCode, user.zipCode) &&
                Objects.equals(favoriteGenre, user.favoriteGenre) &&
                Objects.equals(rideShare, user.rideShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, emailAddress, phoneNumber, city, state, birthdate, zipCode, favoriteGenre, rideShare);
    }
}