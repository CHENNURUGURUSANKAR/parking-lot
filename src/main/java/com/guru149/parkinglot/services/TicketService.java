package com.guru149.parkinglot.services;

import com.guru149.parkinglot.models.ParkingSpot;
import com.guru149.parkinglot.models.Ticket;
import com.guru149.parkinglot.models.VehicleType;
import com.guru149.parkinglot.repos.ParkingSpotRepository;
import com.guru149.parkinglot.repos.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {


    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot spot) {

        Ticket ticket = Ticket
                .builder()
                .entryTime(LocalDateTime.now())
                .floorNumber(spot.getFloorNumber())
                .spotNumber(spot.getId())
                .build();

        return ticketRepository.save(ticket);
    }


}
