package com.thehit.domain;

public class Ticket {

	private String ticketNumber;
	private String ticket_price;
	
	public Ticket(){
		
	}
	
	public Ticket(String ticket_price, String ticket_number){
		this.ticket_price=ticket_price;
		this.ticketNumber=ticket_number;		
	}
	
	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}

	
}
