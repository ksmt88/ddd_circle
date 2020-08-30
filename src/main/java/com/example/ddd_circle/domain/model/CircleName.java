package com.example.ddd_circle.domain.model;

import lombok.Getter;

@Getter
public class CircleName {
    private final String value;

    public CircleName(String value) {
        if (value == null) {
            throw new IllegalArgumentException(this.getClass().getName());
        }
        if (value.length() < 3) {
            throw new IllegalArgumentException("circle name is more than 3 characters");
        }
        if (value.length() > 20) {
            throw new IllegalArgumentException("circle name is less than 20 characters");
        }

        this.value = value;
    }
}
