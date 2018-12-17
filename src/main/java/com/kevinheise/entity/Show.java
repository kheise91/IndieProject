package com.kevinheise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Show.
 */
@Entity(name = "Show")
@Table(name = "user_show")
public class Show {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "user_show_ibfk_1")
    )
    private User user;

    @Column(name = "show_id")
    private String showId;

    /**
     * Instantiates a new Show.
     */
    public Show() {
    }

    /**
     * Instantiates a new Show.
     *
     * @param user   the user
     * @param showId the show id
     */
    public Show(User user, String showId) {
        this.user = user;
        this.showId = showId;
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
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets show id.
     *
     * @return the show id
     */
    public String getShowId() {
        return showId;
    }

    /**
     * Sets show id.
     *
     * @param showId the show id
     */
    public void setShowId(String showId) {
        this.showId = showId;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", user=" + user +
                ", showId='" + showId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Show show = (Show) o;

        if (id != show.id) return false;
        if (user != null ? !user.equals(show.user) : show.user != null) return false;
        return showId != null ? showId.equals(show.showId) : show.showId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (showId != null ? showId.hashCode() : 0);
        return result;
    }
}
