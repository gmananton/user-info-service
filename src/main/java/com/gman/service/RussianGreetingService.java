package com.gman.service;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */

/*  Бин не нужно аннотировать @Service, поскольку конфигурация нескольких реализаций бинов
    в зависимости от условий находится в GreetingServiceConfig.
    Если оставить и аннотацию, и конфиг, то Spring попробует заинжектить экземпляр (по-умолчанию by type) и будет ошибка:

    Field greetingService in com.gman.controller.UserInfoController required a single bean, but 2 were found:
	- englishGreetingService: defined in file [/Users/gman/Desktop/SpringBoot/user-info-service/target/classes/com/gman/service/EnglishGreetingService.class]
	- russianGreetingService: defined by method 'russianGreetingService' in class path resource [com/gman/config/GreetingServiceConfig.class]
*/
public class RussianGreetingService implements GreetingService {
    @Override
    public String getGreeting(String userName) {
        return "Привет, " + userName + "!";
    }
}
