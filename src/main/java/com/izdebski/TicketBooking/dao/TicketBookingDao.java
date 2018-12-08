package com.izdebski.TicketBooking.dao;

import com.izdebski.TicketBooking.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
