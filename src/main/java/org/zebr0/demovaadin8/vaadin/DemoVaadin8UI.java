package org.zebr0.demovaadin8.vaadin;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.UI;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.label.MLabel;
import org.vaadin.viritin.layouts.MPanel;
import org.vaadin.viritin.layouts.MVerticalLayout;

@CDIUI("")
@Theme("valo")
@PreserveOnRefresh
@Title("Vaadin 8 Demo")
public class DemoVaadin8UI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new MVerticalLayout()
                .add(new MPanel()
                        .withUndefinedSize()
                        .withContent(new MVerticalLayout()
                                .add(new MLabel("123"))
                                .add(new MButton("Like"))
                                .alignAll(Alignment.MIDDLE_CENTER)))
                .alignAll(Alignment.MIDDLE_CENTER));
    }

}
