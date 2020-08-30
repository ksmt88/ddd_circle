package com.example.ddd_circle.domain.service;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.repository.ICircleRepository;
import org.springframework.stereotype.Component;

@Component
public class CircleService {
    private final ICircleRepository circleRepository;

    public CircleService(ICircleRepository circleRepository) {
        this.circleRepository = circleRepository;
    }

    public boolean Exists(Circle circle) {
        Circle duplicatedCircle = this.circleRepository.Find(circle.getCircleName());

        return duplicatedCircle != null;
    }
}
