package com.guru149.parkinglot.services;

import com.guru149.parkinglot.models.ParkingSpot;
import com.guru149.parkinglot.models.VehicleType;
import com.guru149.parkinglot.repos.ParkingSpotRepository;

public class SpotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType vehicleType) {
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }

}
