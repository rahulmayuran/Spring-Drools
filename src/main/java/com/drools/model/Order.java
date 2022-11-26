package com.drools.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private String name;
    private String cardType;
    private int discount;
    private int price;
}
