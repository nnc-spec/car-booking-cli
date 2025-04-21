package car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao {
    private static final List<Car> CARS= Arrays.asList(
        new Car("1234", new BigDecimal("50.00"), Brand.AUDI, true),
        new Car("567", new BigDecimal("70.00"), Brand.TESLA, true),
        new Car("890", new BigDecimal("100.00"), Brand.MERCEDES, false)
            );

    public List<Car> getAllCars(){
        return CARS;
    }

}
