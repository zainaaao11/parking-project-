package parking.refactored;

public class Vehicle {
    private final String plate;
    private final String type;
    private final Tariff tariff;
    public Vehicle(String plate, String type, Tariff tariff) {
        this.plate = plate;
        this.type = type;
        this.tariff = tariff;
    }
    public double fee(int hours) {
        return this.tariff.fee(hours);
    }
    public String getPlate() {
        return this.plate;
    }
    public String getType() {
        return this.type;
    }
}
