package com.gman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */
@Data
@AllArgsConstructor
public class Car {
    private String name;
    private String model;
    private double engine;
}
