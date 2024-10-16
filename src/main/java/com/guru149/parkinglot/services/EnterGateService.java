package com.guru149.parkinglot.services;

import com.guru149.parkinglot.dtos.TicketDto;
import com.guru149.parkinglot.models.VehicleType;
import org.springframework.stereotype.Service;

@Service
public class EnterGateService {
    public TicketDto createTicket(VehicleType vehicleType) {


        return new TicketDto().toBuilder().build();
    }
}
