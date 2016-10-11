package com.thehit.domain;

import com.thehit.interfaces.Audience;

public class audienceImpl extends Person implements Audience {

	private String first_name;
	private String second_name;
	private String age;
	private Ticket ticket;
	
	public audienceImpl(){
		super();
	}
	
	public audienceImpl(String first_name, String second_name, int age){
		super(first_name, second_name, 0);
	}
	@Override
	public void purchaseTicket() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refundTicket() {
		// TODO Auto-generated method stub

	}

}
