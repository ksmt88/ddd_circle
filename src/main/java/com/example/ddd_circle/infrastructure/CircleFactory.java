package com.example.ddd_circle.infrastructure;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.model.CircleId;
import com.example.ddd_circle.domain.model.CircleName;
import com.example.ddd_circle.domain.model.ICircleFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CircleFactory implements ICircleFactory {
    @Override
    public Circle Create(CircleName name) {
        CircleId id = new CircleId(UUID.randomUUID().toString());

        return new Circle(id , name);
    }
}
