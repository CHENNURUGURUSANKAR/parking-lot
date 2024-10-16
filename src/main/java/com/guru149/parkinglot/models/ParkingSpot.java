package com.guru149.parkinglot.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot extends BaseModel {
    private Integer spotNumber;
    private Integer floorNumber;
    private VehicleType vehicleType;
    private SpotStatus spotStatus;
}
