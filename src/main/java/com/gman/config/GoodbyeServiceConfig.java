package com.gman.config;

import com.gman.service.EnglishGoodbyeService;
import com.gman.service.GoodbyeService;
import com.gman.service.RussianGoodbyeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */

@Configuration
public class GoodbyeServiceConfig {

    @Bean(name = "russianGoodbyeService")
    GoodbyeService russianGoodbyeService() {
        return new RussianGoodbyeService();
    }

    @Bean(name = "englishGoodbyeService")
    GoodbyeService englishGoodbyeService() {
        return new EnglishGoodbyeService();
    }
}
