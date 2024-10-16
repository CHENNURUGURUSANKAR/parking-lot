package com.guru149.parkinglot.repos;

import com.guru149.parkinglot.exceptions.TicketNotFoundException;
import com.guru149.parkinglot.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    public Ticket findTicketById(String ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId().equals(ticketId)) {
                return ticket;
            }
        }
        throw new TicketNotFoundException("Tikcet Not Found on "+ticketId);
    }
}
