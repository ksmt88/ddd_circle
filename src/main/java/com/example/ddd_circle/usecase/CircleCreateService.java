package com.example.ddd_circle.usecase;

import com.example.ddd_circle.domain.model.*;
import com.example.ddd_circle.domain.repository.ICircleRepository;
import com.example.ddd_circle.domain.service.CircleService;
import org.springframework.stereotype.Component;

@Component
public class CircleCreateService {
    private final ICircleFactory    circleFactory;
    private final ICircleRepository circleRepository;
    private final CircleService     circleService;

    public CircleCreateService(
            ICircleFactory circleFactory,
            ICircleRepository circleRepository,
            CircleService circleService
    ) {
        this.circleFactory    = circleFactory;
        this.circleRepository = circleRepository;
        this.circleService    = circleService;
    }

    public void Create(CircleCreateCommand command) {
        CircleName name = new CircleName(command.getName());

        Circle circle = this.circleFactory.Create(name);

        if (this.circleService.Exists(circle)) {
            throw new IllegalArgumentException("circle already exists");
        }

        this.circleRepository.Save(circle);
    }
}
