package com.thehit.domain;
import com.thehit.interfaces.*;
public class Euro implements Currency{

	private static final String EUR = "EUR";
	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return EUR;
	}

}
