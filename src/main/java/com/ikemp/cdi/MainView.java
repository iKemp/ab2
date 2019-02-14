package com.ikemp.cdi;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import javax.inject.Inject;

/**
 * The main view contains a simple label element and a template element.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow with CDI", shortName = "Project Base")
public class MainView extends VerticalLayout {

    @Inject
    private MessageBean messageBean;

    public MainView() {
        add(new Label("ab2"));

        TextField field = new TextField();
        add(field);

        Button button = new Button("Click me",
                event -> Notification.show(messageBean.getMessage() + field.getValue()));
        add(button);
    }

}
