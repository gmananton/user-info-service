package com.gman.config;

import com.gman.service.EnglishGreetingService;
import com.gman.service.GreetingService;
import com.gman.service.RussianGreetingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Anton Mikhaylov on 16.11.17.
 */

@Configuration
public class GreetingServiceConfig {

    @Bean
    @ConditionalOnProperty(name = "language.greeting", havingValue = "english", matchIfMissing = true)
    @Primary
    public GreetingService englishGreetingService() {
        return new EnglishGreetingService();
    }

    @Bean
    @ConditionalOnProperty(name = "language.greeting", havingValue = "russian")
    public GreetingService russianGreetingService() {
        return new RussianGreetingService();
    }
}
