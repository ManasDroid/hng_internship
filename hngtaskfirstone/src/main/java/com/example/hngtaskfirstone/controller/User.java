package com.example.hngtaskfirstone.controller;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;
}
