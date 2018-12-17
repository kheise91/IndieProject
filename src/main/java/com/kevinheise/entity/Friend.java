package com.kevinheise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Friend object
 */
@Entity(name = "Friend")
@Table(name = "user_friend")
public class Friend implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "user_friend_ibfk_1")
    )
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "friend_id",
            foreignKey = @ForeignKey(name = "user_friend_ibfk_2")
    )
    private User friend;

    /**
     * Instantiates a new Friend.
     */
    public Friend() {
    }

    /**
     * Instantiates a new Friend.
     *
     * @param user   the user
     * @param friend the friend
     */
    public Friend(User user, User friend) {
        this.user = user;
        this.friend = friend;
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
     * Gets friend.
     *
     * @return the friend
     */
    public User getFriend() {
        return friend;
    }

    /**
     * Sets friend.
     *
     * @param friend the friend
     */
    public void setFriend(User friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "user=" + user +
                ", friend=" + friend +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Friend friend1 = (Friend) o;

        if (user != null ? !user.equals(friend1.user) : friend1.user != null) return false;
        return friend != null ? friend.equals(friend1.friend) : friend1.friend == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (friend != null ? friend.hashCode() : 0);
        return result;
    }
}
