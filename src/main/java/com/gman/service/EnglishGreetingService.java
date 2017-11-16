package com.gman.service;


/**
 * Created by Anton Mikhaylov on 16.11.17.
 */

public class EnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting(String userName) {
        return "Hello, " + userName + "!";
    }
}
