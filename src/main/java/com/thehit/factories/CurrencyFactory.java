package com.thehit.factories;
import com.thehit.interfaces.Currency;
import com.thehit.domain.*;
public class CurrencyFactory {

	public static Currency createCurrency(String country){
		if(country.equalsIgnoreCase("Ireland")){
			return new Euro();
		}else if(country.equalsIgnoreCase("England")){
			return new Pound();
		}else{
			return null;
		}
	}
}
