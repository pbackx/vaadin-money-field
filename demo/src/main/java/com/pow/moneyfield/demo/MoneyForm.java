package com.pow.moneyfield.demo;

import java.io.Serializable;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class MoneyForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text = "";
	private Money money = Money.zero(CurrencyUnit.USD);

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyForm other = (MoneyForm) obj;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MoneyForm [text=" + text + ", money=" + money + "]";
	}

	
}
