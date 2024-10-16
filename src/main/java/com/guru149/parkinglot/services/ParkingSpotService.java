package com.guru149.parkinglot.services;

import com.guru149.parkinglot.models.ParkingSpot;
import com.guru149.parkinglot.repos.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository pakingSpotRepository;
    public void markSpotBooked(ParkingSpot spot){
        pakingSpotRepository.save(spot);
    }
}
