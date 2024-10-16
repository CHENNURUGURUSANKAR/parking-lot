package com.guru149.parkinglot.services;

import com.guru149.parkinglot.models.Invoice;
import com.guru149.parkinglot.models.Ticket;
import com.guru149.parkinglot.models.VehicleType;
import com.guru149.parkinglot.repos.TicketRepository;
import com.guru149.parkinglot.strategies.BasicStrategy;
import com.guru149.parkinglot.strategies.InvoiceStrategy;
import com.guru149.parkinglot.strategies.LargeVehicleStrategy;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InvoiceService {
    TicketRepository ticketRepository = new TicketRepository();

    public Invoice getInvoice(Ticket ticket) {

        Invoice invoice = Invoice.builder()
                .exitTime(new Date())
                .ticket(ticket).build();

        InvoiceStrategy invoiceStrategy = new BasicStrategy();
        double amount = 0.0;
        if (ticket.getVehicleType() == VehicleType.LARGE) {
            invoiceStrategy = new LargeVehicleStrategy();
            amount = invoiceStrategy.createInvoice();
        } else if (ticket.getVehicleType()==VehicleType.MEDIUM){
            invoiceStrategy = new MediumVehicleStrategy();
            amount = invoiceStrategy.createInvoice();
        }
        invoice.setAmount(amount);
        return invoice;
    }
}
