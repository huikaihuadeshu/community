package com.newcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat dataTimeFormatter(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
