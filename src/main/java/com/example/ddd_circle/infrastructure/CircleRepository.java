package com.example.ddd_circle.infrastructure;

import com.example.ddd_circle.domain.model.Circle;
import com.example.ddd_circle.domain.model.CircleId;
import com.example.ddd_circle.domain.model.CircleName;
import com.example.ddd_circle.domain.repository.ICircleRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CircleRepository implements ICircleRepository {

    @Override
    public void Save(Circle circle) {
        // insert to db
    }

    @Override
    public Circle Find(CircleId id) {
        // fetch from db

        // create circle instance

        return null;
    }

    @Override
    public Circle Find(CircleName name) {
        // fetch from db

        // create circle instance

        return null;
    }

    @Override
    public List<Circle> FindAll() {
        // fetch from db

        List<Circle> circles = new ArrayList<>();

        circles.add(new Circle(new CircleId("1"), new CircleName("AAA")));
        circles.add(new Circle(new CircleId("2"), new CircleName("BBB")));
        circles.add(new Circle(new CircleId("3"), new CircleName("CCC")));

        return circles;
    }
}
