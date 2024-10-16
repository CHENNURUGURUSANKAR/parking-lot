package com.guru149.parkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EntryGate  extends Gate{
    private DisplayBoard displayBoard;
}
