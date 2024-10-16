package com.guru149.parkinglot.exceptions;

public class TicketNotFoundException extends RuntimeException {
    public TicketNotFoundException(String s) {
        super(s);
    }
}
