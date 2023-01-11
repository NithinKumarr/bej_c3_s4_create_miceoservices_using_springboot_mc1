package com.example.ApiGatewayService.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfig {
    @Bean
    public RouteLocator getRoutes(RouteLocatorBuilder builder){
        return builder.routes().route(p->p.path("/api/authservice/**").
                uri("http://localhost:7085")).
                route(p->p.path("/api/musicservice/**").
                uri("http://localhost:6500")).build();
    }
}
