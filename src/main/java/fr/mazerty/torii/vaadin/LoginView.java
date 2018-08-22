package fr.mazerty.torii.vaadin;

import com.vaadin.cdi.CDIView;
import com.vaadin.data.HasValue;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import fr.mazerty.torii.bean.User;
import fr.mazerty.torii.cdi.Language;
import fr.mazerty.torii.cdi.LanguageProxy;
import fr.mazerty.torii.cdi.Session;
import fr.mazerty.torii.service.UserService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import static com.vaadin.ui.Notification.Type.ERROR_MESSAGE;

/**
 * Special view to login to the application. Anyone can access it.
 */
@CDIView(LoginView.VIEW_NAME)
public class LoginView extends MyView {

    static final String VIEW_NAME = "login";

    @Inject
    private LanguageProxy lp;
    @Inject
    private Session session;
    @Inject
    private UserService userService;

    private ComboBox<Language> cbLanguage;
    private MyLoginForm loginForm;

    @PostConstruct
    public void postConstruct() {
        cbLanguage = new ComboBox<>();
        cbLanguage.setEmptySelectionAllowed(false);
        cbLanguage.setItems(Language.ENGLISH, Language.FRENCH);
        cbLanguage.addValueChangeListener(this::changeLanguage);

        loginForm = new MyLoginForm(lp);
        loginForm.addLoginListener(this::login);
        Panel panel = new Panel(loginForm);
        panel.setSizeUndefined();

        addComponents(cbLanguage, panel);
        setComponentAlignment(cbLanguage, Alignment.MIDDLE_RIGHT);
        setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
    }

    private void changeLanguage(HasValue.ValueChangeEvent<Language> event) {
        lp.set(event.getValue());
        loginForm.refreshCaptions();
    }

    private void login(@SuppressWarnings("unused") LoginForm.LoginEvent loginEvent) {
        User user = userService.authenticate(loginForm.getBean());
        if (user == null) {
            Notification.show(lp.l("loginwindow.error"), ERROR_MESSAGE);
        } else {
            session.login(user);
            navigateTo(MainView.VIEW_NAME);
        }
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        cbLanguage.setSelectedItem(lp.get());

        loginForm.setBean(new User());
        loginForm.focus();
    }

}
