package com.kevinheise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type User.
 */
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
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

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "favorite_genre")
    private String favoriteGenre;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Show> shows = new HashSet<>();

    private Set<User> friends = new HashSet<>();

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
     * @param zipCode       the zip code
     * @param favoriteGenre the favorite genre
     */
    public User(String username, String password, String firstName, String lastName, String emailAddress, String phoneNumber, String zipCode, String favoriteGenre) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.favoriteGenre = favoriteGenre;
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
     * Gets shows.
     *
     * @return the shows
     */
    public Set<Show> getShows() {
        return shows;
    }

    /**
     * Sets shows.
     *
     * @param shows the shows
     */
    public void setShows(Set<Show> shows) {
        this.shows = shows;
    }

    /**
     * Add show.
     *
     * @param show the show
     */
    public void addShow(Show show) {
        shows.add(show);
    }

    /**
     * Remove show.
     *
     * @param show the show
     */
    public void removeShow(Show show) {
        shows.remove(show);
        show.setUser(null);
    }

    /**
     * Gets friends.
     *
     * @return the friends
     */
    public Set<User> getFriends() {
        return friends;
    }

    /**
     * Sets friends.
     *
     * @param friends the friends
     */
    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    /**
     * Add friend.
     *
     * @param friend the friend
     */
    public void addFriend(User friend) {
        friends.add(friend);
    }

    /**
     * Remove friend.
     *
     * @param friend the friend
     */
    public void removeFriend(User friend) {
        friends.remove(friend);
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
                ", zipCode='" + zipCode + '\'' +
                ", favoriteGenre='" + favoriteGenre + '\'' +
                ", roles=" + roles +
                ", shows=" + shows +
                ", friends=" + friends +
                '}';
    }
}
