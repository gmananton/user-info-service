package com.gman.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.gman.dto.Car;
import com.gman.dto.User;

import java.util.List;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@Service
public class UserService {

    @Value("${nickname}")
    private String nick;


    public User createUser(String name, int age, List<Car> cars) {
        return new User(name, nick, age, cars);
    }

}
