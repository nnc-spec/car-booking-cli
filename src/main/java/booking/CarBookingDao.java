package booking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarBookingDao {
    private final static List<CarBooking> carBookings;

    static {
        carBookings = new ArrayList<CarBooking>();
    }

    public static List<CarBooking> getCarBookings() {
        return carBookings;
    }

    public void book(CarBooking carBooking){
       carBookings.add(carBooking);
    }

    public void cancelCarBooking(UUID id){

    }
}
