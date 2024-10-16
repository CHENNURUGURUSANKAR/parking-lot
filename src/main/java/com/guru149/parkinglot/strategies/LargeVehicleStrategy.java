package com.guru149.parkinglot.strategies;

public class LargeVehicleStrategy implements InvoiceStrategy {
    @Override
    public double createInvoice() {
        return 200;
    }
}
