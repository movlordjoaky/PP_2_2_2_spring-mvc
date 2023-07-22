package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(name = "count", required = false) String count) {
        CarService carService = new CarServiceImpl();
        System.out.println(count);
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Toyota", 2015, 60000));
        allCars.add(new Car("BMW ", 2010, 100000));
        allCars.add(new Car("Ford", 2022, 10000));
        allCars.add(new Car("Mercedes", 2023, 0));
        allCars.add(new Car("Tesla", 2018, 25000));

        List<Car> newCars = carService.getCars(allCars, count);
        model.addAttribute("cars", newCars);
        return "cars";
    }
}
