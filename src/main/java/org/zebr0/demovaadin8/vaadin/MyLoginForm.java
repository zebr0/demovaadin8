package org.zebr0.demovaadin8.vaadin;

import com.vaadin.data.Binder;
import com.vaadin.ui.*;
import org.vaadin.viritin.button.PrimaryButton;
import org.zebr0.demovaadin8.bean.User;
import org.zebr0.demovaadin8.cdi.LanguageProxy;

/**
 * Custom bean-backed {@link LoginForm}
 */
class MyLoginForm extends LoginForm {

    private LanguageProxy lp;

    private final Binder<User> binder = new Binder<>();
    private final TextField username = new TextField();
    private final PasswordField password = new PasswordField();
    private final Button login = new PrimaryButton();

    MyLoginForm(LanguageProxy lp) {
        this.lp = lp;

        binder.forField(username).bind(User::getUsername, User::setUsername);
        binder.forField(password).bind(User::getPassword, User::setPassword);
    }

    @Override
    protected TextField createUsernameField() {
        return username;
    }

    @Override
    protected PasswordField createPasswordField() {
        return password;
    }

    @Override
    protected Button createLoginButton() {
        return login;
    }

    @Override
    protected Component createContent(TextField userNameField, PasswordField passwordField, Button loginButton) {
        FormLayout formLayout = new FormLayout(userNameField, passwordField, loginButton);
        formLayout.setSizeUndefined();
        formLayout.setMargin(true);

        return formLayout;
    }

    @Override
    public void focus() {
        username.focus();
    }

    /**
     * Since the language can be changed while this form is displayed, we need a method to refresh the captions
     */
    void refreshCaptions() {
        username.setCaption(lp.l("user.username.caption"));
        password.setCaption(lp.l("user.password.caption"));
        login.setCaption(lp.l("loginform.button.caption"));
    }

    public User getBean() {
        return binder.getBean();
    }

    public void setBean(User bean) {
        binder.setBean(bean);
    }

}
