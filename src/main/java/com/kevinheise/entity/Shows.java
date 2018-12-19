package com.kevinheise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * The type Shows.
 */
@Entity(name = "Shows")
@Table(name = "shows")
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "shows_user_user_id_fk")
    )
    private User user;

    @Column(name = "show_id")
    private String showId;

    /**
     * Instantiates a new Shows.
     */
    public Shows() {
    }

    /**
     * Instantiates a new Shows.
     *
     * @param user   the user
     * @param showId the show id
     */
    public Shows(User user, String showId) {
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
        return "Shows{" +
                "id=" + id +
                ", user=" + user +
                ", showId='" + showId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shows shows = (Shows) o;
        return id == shows.id &&
                Objects.equals(user, shows.user) &&
                Objects.equals(showId, shows.showId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, showId);
    }
}