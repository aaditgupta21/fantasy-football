package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class facts {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/facts")
    public String facts() {

        // load HTML VIEW (birds.html)
        return "facts";

    }
}