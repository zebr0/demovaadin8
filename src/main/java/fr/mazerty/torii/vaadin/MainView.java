package fr.mazerty.torii.vaadin;

import com.vaadin.cdi.CDIView;
import com.vaadin.ui.Button;

import javax.annotation.PostConstruct;

/**
 * Special view for the application's main menu. Only logged users can access it.
 */
@CDIView(MainView.VIEW_NAME)
public class MainView extends MyView {

    static final String VIEW_NAME = "main";

    @PostConstruct
    public void postConstruct() {
        Button admin = new Button("admin");
        admin.addClickListener(event -> navigateTo(AdminView.VIEW_NAME));
        addComponent(admin);
    }

}
