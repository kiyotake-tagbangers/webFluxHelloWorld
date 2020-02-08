package com.webflux.helloWorld.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

    @Bean
    RouterFunction<ServerResponse> routes(Handler handler){
        return handler.routes();
    }
}
