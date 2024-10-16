package com.guru149.parkinglot.controllers;

import com.guru149.parkinglot.dtos.TicketDto;
import com.guru149.parkinglot.models.VehicleType;
import com.guru149.parkinglot.services.EnterGateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/entry")
@AllArgsConstructor
public class EntryGateController {
    EnterGateService enterGateService;

    public TicketDto createTicket(VehicleType vehicleType){
        return enterGateService.createTicket(vehicleType);
    }

}
