package com.kevinheise.persistence;

import com.kevinheise.entity.Role;
import com.kevinheise.entity.User;
import com.kevinheise.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    GenericDao userDao;
    GenericDao roleDao;

    @BeforeEach
    void setUp() {
        userDao = new GenericDao(User.class);
        roleDao = new GenericDao(Role.class);

        Database database = com.kevinheise.testUtils.Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verify successful retrieval of user by id
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = (User) userDao.getById(1);
        assertEquals("John", retrievedUser.getFirstName());
        assertEquals("Johnson", retrievedUser.getLastName());
    }

    /**
     * Verify successful insert of user
     */
    @Test
    void insertUserSuccess() {
        User newUser = new User("kheise", "kheise@madisoncollege.edu", "kevinpassword", "Kevin", "Heise", new Date(1991-04-30), "53901", "Classical");
        int id = userDao.insert(newUser);
        assertNotEquals(0, id);

        User insertedUser = (User) userDao.getById(id);
        assertEquals("Kevin", insertedUser.getFirstName());
        assertEquals("Heise", insertedUser.getLastName());
    }

    /**
     * Verify successful insert of user with Role
     */
    @Test
    void insertUserWithRoleSuccess() {
        User newUser = new User("kheise", "kheise@madisoncollege.edu", "kevinpassword", "Kevin", "Heise", new Date(1991-04-30), "53901", "Classical");
        Role newRole = new Role("user", "kheise", newUser);
        newUser.addRole(newRole);

        int id = userDao.insert(newUser);
        User insertedUser = (User) userDao.getById(id);
        List<Role> roleList = roleDao.getByPropertyEqual("username", insertedUser.getUsername());
        Role insertedRole = roleList.get(0);

        assertEquals(insertedRole.getUsername(), insertedUser.getUsername());
    }

    /**
     * Verify successful update of user
     */
    @Test
    void updateUserSuccess() {
        User userToUpdate = (User) userDao.getById(1);
        userToUpdate.setFirstName("Mark");
        userToUpdate.setLastName("Matthews");
        userDao.saveOrUpdate(userToUpdate);

        User updatedUser = (User) userDao.getById(1);
        assertEquals("Mark", updatedUser.getFirstName());
        assertEquals("Matthews", updatedUser.getLastName());
    }

    /**
     * Verify successful removal of user
     */
    @Test
    void removeUserSuccess() {
        userDao.delete(userDao.getById(1));
        assertNull(userDao.getById(1));
    }

    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = userDao.getAll();
        assertEquals(3, users.size());
    }

    /**
     * Verify successful retrieval of user by username
     */
    @Test
    void getByUsernameSuccess() {
        List<User> retrievedUserList = userDao.getByPropertyEqual("username", "johnj");
        assertEquals(1, retrievedUserList.size());

        User retrievedUser = retrievedUserList.get(0);
        assertEquals("johnJ", retrievedUser.getUsername());
    }
}
