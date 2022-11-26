package com.drools.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IndianCars {

    private String brand;
    private String model;
    private int price;

    private int discount;
    private int finalPrice;
}
