package com.cloud.gateway.infrastructure.configuration;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class GlobalFilterConfiguration {

    @Bean
    @Order(-1)
    public GlobalFilter globalAuthFilter() {
        return new GlobalAuthFilter();
    }
}
