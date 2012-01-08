package com.pow.moneyfield.addon;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.vaadin.addon.customfield.CustomField;

import com.vaadin.ui.Label;

/**
 * Add-on can be fully server-side (with or without UI components) or have client-side widgets.
 */
public class MoneyField extends CustomField
{
	private static final long serialVersionUID = 1L;

	public MoneyField() {
		this(Money.zero(CurrencyUnit.USD));
	}
	
	public MoneyField(Money money) {
		this(null, money);
    }
	
	public MoneyField(String caption) {
		this(caption, Money.zero(CurrencyUnit.USD));
	}
	
	public MoneyField(String caption, Money money) {
		this.setValue(money);
		this.setCaption(caption);
		
        setCompositionRoot(new Label("money here"));
	}

	@Override
	public Class<?> getType() {
		return Money.class;
	}
    
    
}
