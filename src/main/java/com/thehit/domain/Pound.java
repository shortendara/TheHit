package com.thehit.domain;

import com.thehit.interfaces.Currency;

public class Pound implements Currency {

	private static final String GBP = "GBP";
	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return GBP;
	}

}
