package org.zebr0.demovaadin8.vaadin;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.layouts.MPanel;
import org.vaadin.viritin.layouts.MVerticalLayout;
import org.zebr0.demovaadin8.dao.LikeDao;

import javax.inject.Inject;

@CDIUI("")
@Theme("valo")
@PreserveOnRefresh
@Title("Vaadin 8 Demo")
public class DemoVaadin8UI extends UI {

    @Inject
    private LikeDao likeDao;

    private Label label = new Label();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new MVerticalLayout()
                .add(new MPanel()
                        .withUndefinedSize()
                        .withContent(new MVerticalLayout()
                                .add(label)
                                .add(new MButton("Like").withIcon(VaadinIcons.HEART).withListener(this::like))
                                .alignAll(Alignment.MIDDLE_CENTER)))
                .alignAll(Alignment.MIDDLE_CENTER));

        refresh(vaadinRequest);
    }

    @Override
    protected void refresh(VaadinRequest request) {
        label.setValue(String.valueOf(likeDao.count()));
    }

    private void like(Button.ClickEvent event) {
        likeDao.insert();

        refresh(null);
    }

}
