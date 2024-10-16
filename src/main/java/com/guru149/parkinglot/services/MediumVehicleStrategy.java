package com.guru149.parkinglot.services;

import com.guru149.parkinglot.strategies.InvoiceStrategy;

public class MediumVehicleStrategy implements InvoiceStrategy {
    @Override
    public double createInvoice() {
        return 150;
    }
}
