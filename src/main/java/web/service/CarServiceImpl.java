package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> allCars, String numberOfCars) {
        if (numberOfCars == null) {
            return allCars;
        }
        int count = Integer.parseInt(numberOfCars);
        if (count >= 5) {
            return allCars;
        }
        return allCars.subList(0, count);
    }
}
