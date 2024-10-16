package com.guru149.parkinglot.services;

import com.guru149.parkinglot.dtos.TicketDto;
import com.guru149.parkinglot.models.ParkingSpot;
import com.guru149.parkinglot.models.SpotStatus;
import com.guru149.parkinglot.models.Ticket;
import com.guru149.parkinglot.models.VehicleType;
import org.springframework.stereotype.Service;

@Service
public class EnterGateService {
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    SpotAllocationService allocationService = new SpotAllocationService();
    TicketService ticketService = new TicketService();

    public TicketDto createTicket(VehicleType vehicleType) {

        // Early returns
        ParkingSpot parkingSpot = allocationService.allocateSlot(vehicleType);
        if (parkingSpot == null) {
            throw new RuntimeException("Slot not available!");
        }

        // Update parking spot
        parkingSpot.setSpotStatus(SpotStatus.BOOKED);
        parkingSpotService.markSpotBooked(parkingSpot);

        // Create and persist ticket
        Ticket ticket = ticketService.createTicket(vehicleType, parkingSpot);

        return TicketDto
                .builder()
                .entryTime(ticket.getEntryTime())
                .vehicleType(ticket.getVehicleType())
                .build();
    }
}
