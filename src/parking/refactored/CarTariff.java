package parking.refactored;

public class CarTariff implements Tariff {
    public double fee(int hours) {
        return 5.0 * hours;
    }
}
