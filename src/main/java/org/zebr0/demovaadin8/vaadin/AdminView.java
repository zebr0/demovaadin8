package org.zebr0.demovaadin8.vaadin;

import com.vaadin.cdi.CDIView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import org.zebr0.demovaadin8.bean.User;
import org.zebr0.demovaadin8.cdi.LanguageProxy;
import org.zebr0.demovaadin8.cdi.event.UserChangedEvent;
import org.zebr0.demovaadin8.service.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * Special view for the application's administration. Logged user needs to be administrator to access it.
 */
@CDIView(AdminView.VIEW_NAME)
public class AdminView extends MyView {

    static final String VIEW_NAME = "admin";

    @Inject
    private LanguageProxy lp;
    @Inject
    private UserService userService;

    private Grid<User> grid;

    @PostConstruct
    public void postConstruct() {
        Button back = new Button(lp.l("back"));
        back.addClickListener(event -> navigateTo(MainView.VIEW_NAME));

        Button add = new Button(lp.l("add"));

        grid = new Grid<>();
        grid.addColumn(User::getEmail).setCaption(lp.l("user.email.caption"));
        grid.addColumn(User::getAdmin).setCaption(lp.l("user.admin.caption"));

        HorizontalLayout horizontalLayout = new HorizontalLayout(back, grid, add);

        addComponent(horizontalLayout);
        setComponentAlignment(horizontalLayout, Alignment.TOP_CENTER);

        refreshGrid(null);
    }

    private void refreshGrid(@Observes UserChangedEvent event) {
        grid.setItems(userService.list());
    }

}
