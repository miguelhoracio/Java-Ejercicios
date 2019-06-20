package com.enroutesystems.models;

public class Sell {
	
	private int ticketNumber;
	private int[] date = new int[3];
	private String root;

	public Sell(int ticketNumber, int j, int k, int l, String root) {
		this.ticketNumber = ticketNumber;
		this.date[0] = j;
		this.date[1] = k;
		this.date[2] = l;
		this.root = root;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public int[] getDate() {
		return date;
	}

	public void setDate(int[] date) {
		this.date = date;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

}
