package com.gman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gman.dto.Car;
import com.gman.dto.User;
import com.gman.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@RestController
@RequestMapping("/")
public class UserInfoController {

    @Autowired
    UserService userService;


    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("{somePath}")
    public String somePath(@PathVariable String somePath) {
        return "This path is new for me: " + somePath;
    }

    @RequestMapping("hello")
    public String greetUser(@RequestParam (name = "username", defaultValue = "USERNAME") String userName) {
        return "Hello " + userName + "\n";
    }

    @RequestMapping("userInfo/{name}/{age}")
    public User printUserInfo(@PathVariable String name, @PathVariable int age) {


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Peugeot", "308", 1.6));
        cars.add(new Car("Skoda", "Octavia", 1.8));
        return userService.createUser(name, age, cars);
    }


}
