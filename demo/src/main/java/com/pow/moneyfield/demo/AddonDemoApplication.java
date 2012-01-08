package com.pow.moneyfield.demo;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import com.vaadin.Application;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import com.pow.moneyfield.addon.MoneyField;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class AddonDemoApplication extends Application
{
    private Window window;
    private Money moneyBean = Money.zero(CurrencyUnit.USD);
    private MoneyForm moneyForm = new MoneyForm();

    @Override
    public void init()
    {
        window = new Window("MoneyField demo application");
        setMainWindow(window);
     
        final HorizontalLayout mainLayout = new HorizontalLayout();
        mainLayout.setSizeFull();
        window.addComponent(mainLayout);
        
        final VerticalLayout plainLayout = new VerticalLayout();
        plainLayout.setWidth("50%");
        mainLayout.addComponent(plainLayout);
        
        plainLayout.addComponent(new Label("Standalone usage"));
        plainLayout.addComponent(new MoneyField("Money", moneyBean));
        plainLayout.addComponent(new TextField("Text"));
        //commit button -> shows value
        //validate button -> validates (duh)
        //convert to USD button -> converts everything to USD
        
        final VerticalLayout formLayout = new VerticalLayout();
        mainLayout.addComponent(formLayout);
        
        formLayout.addComponent(new Label("As part of a form"));
        final Form form = new Form();
        form.setFormFieldFactory(new MoneyFormFieldFactory());
        form.setItemDataSource(new BeanItem<MoneyForm>(moneyForm));
        formLayout.addComponent(form);
        //same functions as above
    }
}
