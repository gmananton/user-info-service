package com.gman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String nick;
    private int age;
    private List<Car> cars;
}
