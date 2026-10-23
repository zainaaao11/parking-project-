package parking.refactored;
import java.io.IOException;
public class ParkingServiceTest {

    public static void main(String[] args) throws IOException {
        ParkingLog logger = line -> {};
        ParkingService service = new ParkingService(logger, new ParkingFormatter());
        Vehicle car = new Vehicle("1", "CAR", new CarTariff());
        Vehicle bike = new Vehicle("2", "MOTORBIKE", new MotorbikeTariff());
        Vehicle truck = new Vehicle("3", "TRUCK", new TruckTariff());
        assert service.fee(car, 3) == 15.0;
        assert service.fee(bike, 2) == 4.0;
        assert service.fee(truck, 4) == 60.0;
        PaymentMethod card = new CardPayment("4242");
        service.checkout(car, 3, card);
        service.checkout(bike, 2, card);
        service.checkout(truck, 4, card);
        assert service.dailyReport().contains("Total: 79.0 MAD");
    }
}