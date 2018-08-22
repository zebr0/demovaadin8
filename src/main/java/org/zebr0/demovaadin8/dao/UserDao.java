package org.zebr0.demovaadin8.dao;

import org.zebr0.demovaadin8.bean.User;

import java.util.List;

public interface UserDao {

    /**
     * Returns all information pertaining to the user whose username is given as parameter, or null if no user has been found.
     *
     * @param username username to look for
     * @return {@link User} instance corresponding to the given username, or null if no user has been found
     */
    User selectByUsername(String username);

    /**
     * @return {@link List} of all the {@link User}s in the database
     */
    List<User> selectAll();

    /**
     * Inserts the given {@link User} in the database
     */
    void insert(User user);

}
