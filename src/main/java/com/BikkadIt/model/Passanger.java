package com.BikkadIt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passanger_data")
public class Passanger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PId;
	private String doj;
	private String fname;
	private String Departure;
	private String source;
	private String Destination;
	@Override
	public String toString() {
		return "Passanger [PId=" + PId + ", doj=" + doj + ", fname=" + fname + ", Departure=" + Departure + ", source="
				+ source + ", Destination=" + Destination + "]";
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDeparture() {
		return Departure;
	}
	public void setDeparture(String departure) {
		Departure = departure;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}

}
