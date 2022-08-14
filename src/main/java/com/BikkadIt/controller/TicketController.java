package com.BikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.model.Passanger;
import com.BikkadIt.model.Ticket;
import com.BikkadIt.service.PassangerServiceimpl;


@RestController
public class TicketController {

	
	@Autowired
	private PassangerServiceimpl serviceImpl;



@PostMapping(value="/getTicket",consumes ="application/json",produces="application/json")
public ResponseEntity<Ticket>bookTicket(@RequestBody Passanger passenger){
	Ticket ticketStatus= serviceImpl.ticketStatus(passenger);
	
	if(ticketStatus.getTicketStatus()==null) {
		ticketStatus.setTicketStatus("Booking Not Confirmed");
		return new ResponseEntity<Ticket>(ticketStatus,HttpStatus.BAD_REQUEST);
	}
	return new ResponseEntity<Ticket>(ticketStatus,HttpStatus.OK);
	
}
	
}
