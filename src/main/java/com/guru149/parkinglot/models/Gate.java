package com.guru149.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Gate {
    private String location;
    private Operator operator;
}
