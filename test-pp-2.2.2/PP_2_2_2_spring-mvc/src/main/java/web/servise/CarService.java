package web.servise;

import org.springframework.stereotype.Component;
import web.controller.CarController;
import web.model.Car;

import java.util.List;

@Component
public interface CarService {
    List<Car> ret(Long amount);
}
