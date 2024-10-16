package com.guru149.parkinglot.dtos;

import com.guru149.parkinglot.models.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(toBuilder = true)
public class TicketDto {
    private String ticketId;
    private int floorNumber;
    private int spotNumber;
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
}
