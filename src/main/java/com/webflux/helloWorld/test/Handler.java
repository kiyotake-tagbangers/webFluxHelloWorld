package com.webflux.helloWorld.test;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class Handler {
    public RouterFunction<ServerResponse> routes() {
        return route()
                .GET("/hello", this::hello)
                .build();
    }

    private Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return ok().body(Mono.just("HelloWorld!"), String.class);
    }

}
