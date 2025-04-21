package car;

import java.math.BigDecimal;

public class CarDao {
    private static final Car[] CARS= {
        new Car("1234", new BigDecimal("50.00"), Brand.AUDI, true),
        new Car("567", new BigDecimal("70.00"), Brand.TESLA, true),
        new Car("890", new BigDecimal("100.00"), Brand.MERCEDES, false)
    };

    public Car[] getAllCars(){
        return CARS;
    }

}
