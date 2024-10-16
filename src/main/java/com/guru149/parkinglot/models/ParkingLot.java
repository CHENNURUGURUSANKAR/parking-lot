package com.guru149.parkinglot.models;

import com.guru149.parkinglot.exceptions.InvalidParkingLotAddressException;
import com.guru149.parkinglot.exceptions.InvalidParkingLotNameException;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder


public class ParkingLot extends BaseModel {
    private String name;
    private String address;

    private ParkingLot() {

    }

    @lombok.Builder.Default
    private List<ParkingFloor> floors = new ArrayList<>();
    @lombok.Builder.Default

    private List<ExitGate> exitGates = new ArrayList<>();
    @lombok.Builder.Default

    private List<EntryGate> entryGates = new ArrayList<>();

  /*  public static class Builder {
        private ParkingLot parkingLot = new ParkingLot();

        private Builder seName(String name) {
            parkingLot.name = name;
            return this;
        }

        private Builder setAddress(String name) {
            parkingLot.address = name;
            return this;
        }

        private ParkingLot build() {
            if (parkingLot.getName() == null) {
                throw new InvalidParkingLotNameException("please add name for parking lot before building parking lot");
            } else if (parkingLot.getAddress() == null) {
                throw new InvalidParkingLotAddressException("please add address for parking lot before building parking lot");
            }
            return parkingLot;
        }

    }*/
}
