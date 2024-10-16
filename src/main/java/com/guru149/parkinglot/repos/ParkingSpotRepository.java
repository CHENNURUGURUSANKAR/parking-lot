package com.guru149.parkinglot.repos;

import com.guru149.parkinglot.models.ParkingSpot;
import com.guru149.parkinglot.models.SpotStatus;
import com.guru149.parkinglot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {
    List<ParkingSpot> spotList = new ArrayList<>();

    public ParkingSpot save(ParkingSpot spot) {
        spotList.add(spot);
        return spot;
    }
    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type) {

        for (ParkingSpot parkingSpot: spotList) {

            if (parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == type){
                return parkingSpot;
            }
        }

        return null;
    }
}
