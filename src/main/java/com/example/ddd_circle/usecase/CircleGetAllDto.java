package com.example.ddd_circle.usecase;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.model.CircleId;
import com.example.ddd_circle.domain.model.CircleName;
import lombok.Getter;

@Getter
public class CircleGetAllDto {
    private String id;
    private String name;

    public CircleGetAllDto(CircleId id, CircleName name) {
        this.id   = id.getValue();
        this.name = name.getValue();
    }
}
