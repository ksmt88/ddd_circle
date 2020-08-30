package com.example.ddd_circle.domain.model;

import lombok.Getter;

@Getter
public class CircleCreateCommand {
    private final String name;

    public CircleCreateCommand(String name) {
        this.name = name;
    }
}
