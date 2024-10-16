package com.guru149.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private Integer floorNUmber;
    private String name;
    private List<ParkingSpot> spots=new ArrayList<>();
}
