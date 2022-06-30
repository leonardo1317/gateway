package com.cloud.gateway.infrastructure.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class GlobalAuthFilter implements GlobalFilter {

    private static final Logger LOG = LogManager.getLogger(GlobalAuthFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        LOG.info("global auth filter {}", exchange.getRequest().getURI());
        return chain.filter(exchange);
    }
}
