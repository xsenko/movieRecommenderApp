package com.senko.movieService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class moviceServiceController {

    @GetMapping("/ping")
    public String ping() {
        return "pong from movie servive";
    }
}
