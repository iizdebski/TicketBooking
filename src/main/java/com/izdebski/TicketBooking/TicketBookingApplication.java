package com.izdebski.TicketBooking;

import java.util.Date;

import com.izdebski.TicketBooking.entities.Ticket;
import com.izdebski.TicketBooking.service.TicketBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketBookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingApplication.class, args);

		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");

		ticketBookingService.createTicket(ticket);
	}
}