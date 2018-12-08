package com.izdebski.TicketBooking;

import java.util.Date;

import javax.sql.DataSource;

import com.izdebski.TicketBooking.entities.Ticket;
import com.izdebski.TicketBooking.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{

	@Autowired
	private TicketBookingService ticketBookingService;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");

		ticketBookingService.createTicket(ticket);

		System.out.println("DataSource::"+dataSource);
	}
}