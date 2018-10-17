package com.kevinheise.persistence;

import com.kevinheise.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    UserDao dao;

    @BeforeEach
    void setUp() {
        com.kevinheise.testUtils.Database database = com.kevinheise.testUtils.Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();
    }

    /**
     * Verify successful retrieval of user by id
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertEquals("John", retrievedUser.getFirstName());
        assertEquals("Johnson", retrievedUser.getLastName());
    }

    /**
     * Verify successful insert of user
     */
    @Test
    void insertUserSuccess() {
        User newUser = new User("Kevin", "Heise", "mypassword", "kheise@madisoncollege.edu", "53901", "Classical");
        int id = dao.insert(newUser);
        assertNotEquals(0, id);

        User insertedUser = dao.getById(id);
        assertEquals("Kevin", insertedUser.getFirstName());
        assertEquals("Heise", insertedUser.getLastName());
    }

    /**
     * Verify successful update of user
     */
    @Test
    void updateUserSuccess() {
        User userToUpdate = dao.getById(1);
        userToUpdate.setFirstName("Mark");
        userToUpdate.setLastName("Matthews");
        dao.saveOrUpdate(userToUpdate);

        User updatedUser = dao.getById(1);
        assertEquals("Mark", updatedUser.getFirstName());
        assertEquals("Matthews", updatedUser.getLastName());
    }

    /**
     * Verify successful removal of user
     */
    @Test
    void removeUserSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAll();
        assertEquals(3, users.size());
    }
}
