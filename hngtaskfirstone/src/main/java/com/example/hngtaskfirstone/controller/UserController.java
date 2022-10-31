package com.example.hngtaskfirstone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping
    public ResponseEntity <User> getUser (){
        return ResponseEntity.ok(User.builder()
                        .slackUsername("manasdroid")
                        .backend(true)
                        .age(22)
                        .bio("I am a backend Developer")
                .build());
    }
}
