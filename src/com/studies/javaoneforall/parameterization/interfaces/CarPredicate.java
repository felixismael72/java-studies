package com.studies.javaoneforall.parameterization.interfaces;

import com.studies.javaoneforall.parameterization.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
