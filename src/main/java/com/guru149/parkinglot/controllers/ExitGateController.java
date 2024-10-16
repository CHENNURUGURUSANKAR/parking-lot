package com.guru149.parkinglot.controllers;

import com.guru149.parkinglot.models.Ticket;
import com.guru149.parkinglot.services.ExitGateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/exit")

public class ExitGateController {
    ExitGateService exitGateService=new ExitGateService();

    public  void invoice(String ticketId){
        exitGateService.getInvoice(ticketId);
    }
}
