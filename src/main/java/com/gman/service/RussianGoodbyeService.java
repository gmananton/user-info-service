package com.gman.service;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */
public class RussianGoodbyeService implements GoodbyeService {
    @Override
    public String goodbye(String userName) {
        return "Пока, " + userName + "!";
    }
}
