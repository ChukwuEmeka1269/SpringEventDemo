package com.linkedin.events.miniproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.linkedin.events.miniproject")
public class ProjConfig {

    @Bean
    @Primary
    public BridgeStoneTyre bridgeStoneTyre(){
        return new BridgeStoneTyre();
    }


    @Bean
    public MichellinTyre michellinTyre(){
        return new MichellinTyre();
    }




}
