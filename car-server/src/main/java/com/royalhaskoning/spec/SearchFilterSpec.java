package com.royalhaskoning.spec;

import com.royalhaskoning.carstockmanagement.model.SearchRequest;
import com.royalhaskoning.entity.Car;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class SearchFilterSpec {
    public static Specification<Car> searchCarInfo(SearchRequest request) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (request.getMake() != null && !request.getMake().isBlank()) {
                predicates.add(cb.equal(root.get("make"), request.getMake()));
            }
            if (request.getYearOfRelease() != 0) {
                predicates.add(cb.equal(root.get("yearOfRelease"), request.getYearOfRelease()));
            }
            query.orderBy(cb.desc(root.get("id")));
            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }

    public static Specification<Car> searchCar(SearchRequest request) {
        return Specification.where(searchCarInfo(request));
    }
}
