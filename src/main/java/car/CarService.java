package car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao){
        this.carDao = carDao;
    }

    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

    public Car getCar(String regNumber){
        for(Car car: carDao.getAllCars()){
            if(car.getRegNumber().equals(regNumber)){
                return car;
            }
        }
        throw new IllegalStateException(String.format("Car with reg %s not found", regNumber));
    }

    public List<Car> getElectricCars(){
        List<Car> electricCars = getAllCars()
                .stream()
                .filter(car -> car.isElectric())
                .collect(Collectors.toList());
        return electricCars;
    }
}
