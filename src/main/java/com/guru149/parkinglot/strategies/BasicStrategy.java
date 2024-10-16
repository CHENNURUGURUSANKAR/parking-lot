package com.guru149.parkinglot.strategies;

public class BasicStrategy implements InvoiceStrategy {
    @Override
    public double createInvoice() {
        return 100;
    }
}
