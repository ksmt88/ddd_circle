package com.example.ddd_circle.usecase;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.repository.ICircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CircleGetAllService {
    @Qualifier("CircleRepository")
    private final ICircleRepository circleRepository;

    public CircleGetAllService(
            ICircleRepository circleRepository
    ) {
        this.circleRepository = circleRepository;
    }

    public List<CircleGetAllDto> GetAll() {
        List<Circle> circles = this.circleRepository.FindAll();

        List<CircleGetAllDto> dto = new ArrayList<>();
        for (Circle circle:circles) {
            dto.add(new CircleGetAllDto(circle.getCircleId(), circle.getCircleName()));
        }

        return dto;
    }
}
