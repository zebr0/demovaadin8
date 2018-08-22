package org.zebr0.demovaadin8.cdi;

import org.zebr0.demovaadin8.bean.User;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * CDI proxy for the {@link User} currently logged in
 */
@SessionScoped
public class Session implements Serializable {

    private User user;

    public void login(User user) {
        this.user = user;
    }

    public void logout() {
        user = null;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public boolean isAdmin() {
        return isLoggedIn() && Boolean.TRUE.equals(user.getAdmin());
    }

}
