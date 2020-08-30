package com.example.ddd_circle.domain.model;

import lombok.Getter;

@Getter
public class Circle {
    private final CircleId   circleId;
    private final CircleName circleName;

    public Circle(CircleId id, CircleName name) {
        if (id == null || name == null) {
            throw new IllegalArgumentException(this.getClass().getName());
        }

        this.circleId   = id;
        this.circleName = name;
    }
}
