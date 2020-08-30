package com.example.ddd_circle.domain.model;

import lombok.Getter;

@Getter
public class CircleId {
    private final String value;

    public CircleId(String value) {
        if (value == null) {
            throw new IllegalArgumentException(this.getClass().getName());
        }

        this.value = value;
    }
}
