package com.BikkadIt.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Ticket {


	private double prn;
	private String ticketPrice;
	private String ticketStatus;
	public double getPrn() {
		return prn;
	}
	public void setPrn(double d) {
		this.prn = d;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Tickets [prn=" + prn + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus + "]";
	}
}
