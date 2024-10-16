package com.guru149.parkinglot.services;


import com.guru149.parkinglot.dtos.TicketDto;
import com.guru149.parkinglot.models.Invoice;
import com.guru149.parkinglot.models.Ticket;
import com.guru149.parkinglot.repos.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class ExitGateService {
    InvoiceService inVoiceService = new InvoiceService();
    TicketRepository ticketRepository = new TicketRepository();

    public Invoice getInvoice(String ticketId) {
        Ticket ticket = ticketRepository.findTicketById(ticketId);
        Invoice invoice = inVoiceService.getInvoice(ticket);
        return invoice;
    }
}
