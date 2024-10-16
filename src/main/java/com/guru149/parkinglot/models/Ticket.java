package com.guru149.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Ticket extends BaseModel {
    private String ticketId;
    private String vehicleId;
    private VehicleType vehicleType;
    private  Integer floorNumber;
    private Long spotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus ticketStatus;

}
