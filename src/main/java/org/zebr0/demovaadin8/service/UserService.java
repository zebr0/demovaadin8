package org.zebr0.demovaadin8.service;

import org.zebr0.demovaadin8.bean.User;

import java.util.List;

public interface UserService {

    /**
     * Checks if a given user is authorized to access the application.
     *
     * @param user {@link User} instance whose email and password fields are to be challenged
     * @return a new {@link User} instance containing all the existing data about the user, or null if the user doesn't exist or if the email and password don't match
     */
    User authenticate(User user);

    /**
     * @return {@link List} of all known {@link User}s
     */
    List<User> list();

    /**
     * Creates the given {@link User}
     */
    void create(User user);

}
