package com.pow.moneyfield.demo;

import com.pow.moneyfield.addon.MoneyField;
import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;

public class MoneyFormFieldFactory extends DefaultFieldFactory {

	private static final long serialVersionUID = 1L;

	@Override
	public Field createField(Item item, Object propertyId, Component uiContext) {
		final String pid = (String)propertyId;
 		if("money".equals(pid)) {
			return new MoneyField("Money");
		}
		return super.createField(item, propertyId, uiContext);
	}

}
