package car;

public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao){
        this.carDao = carDao;
    }

    public Car[] getAllCars(){
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

    public Car[] getElectricCars(){
        int electricCarsCount = 0;

        Car[] cars = getAllCars();

        if(cars.length == 0){
            return  new Car[0];
        }

        for(Car car: cars){
            if(car.isElectric()){
                electricCarsCount++;
            }
        }

        if(electricCarsCount == 0){
            return new Car[10];
        }

        Car[] electricCars = new Car[electricCarsCount];

        int index = 0;

        for (int i = 0; i < cars.length; i++) {
            if(cars[i].isElectric()){
                electricCars[index++] = cars[i];
            }
        }
        return electricCars;
    }
}
