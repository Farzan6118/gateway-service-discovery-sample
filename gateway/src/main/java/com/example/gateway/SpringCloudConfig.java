package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("testOne", predicateSpec -> predicateSpec.path("/api/v1/**").uri("lb://first-service"))
                .route("testTwo", predicateSpec -> predicateSpec.path("/api/v2/**").uri("lb://second-service"))
                .build();

    }
}
