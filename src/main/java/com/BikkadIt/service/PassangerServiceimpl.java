package com.BikkadIt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.model.Passanger;
import com.BikkadIt.model.Ticket;
import com.BikkadIt.repository.PassangerRepository;

@Service
public class PassangerServiceimpl  {

	@Autowired  
	private PassangerRepository  passangerRepository;
	
	public Ticket ticketStatus(Passanger passenger) {
		if(passenger== null) {
			return null;
		}else {
			
		
         passangerRepository.save(passenger);
			Ticket t= new Ticket();
			t.setPrn((int)(Math.random()*100));
			t.setTicketStatus("Confirm");
			t.setTicketPrice("500");
			
			return t;
		}
	}

	
	
}
