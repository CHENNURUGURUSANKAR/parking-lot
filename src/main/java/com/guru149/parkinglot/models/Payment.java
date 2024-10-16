package com.guru149.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String ticketId;
    private double amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
}
