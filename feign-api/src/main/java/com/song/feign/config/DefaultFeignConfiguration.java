package com.song.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;


public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }
}
