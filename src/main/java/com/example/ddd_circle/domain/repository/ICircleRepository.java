package com.example.ddd_circle.domain.repository;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.model.CircleId;
import com.example.ddd_circle.domain.model.CircleName;

import java.util.List;

public interface ICircleRepository {
    void Save(Circle circle);

    Circle Find(CircleId id);

    Circle Find(CircleName name);

    List<Circle> FindAll();
}
