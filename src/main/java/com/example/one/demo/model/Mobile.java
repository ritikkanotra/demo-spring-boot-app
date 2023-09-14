package com.example.one.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mobile {
    private String companyName;
    private String modelNumber;
    private int ramSize;
    private int storageSize;
}
