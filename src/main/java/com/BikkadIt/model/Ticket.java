package com.BikkadIt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private String prn;
	private String ticketPrice;
	private String ticketStatus;
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
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
