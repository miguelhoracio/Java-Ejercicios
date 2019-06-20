package com.enroutesystems.models;

public class Item {
	private int ticketNumber;
	private int code;
	private int amount;
	
	public Item(int ticketNumber, int code, int amount) {
		this.ticketNumber = ticketNumber;
		this.code = code;
		this.amount = amount;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
