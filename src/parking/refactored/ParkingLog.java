package parking.refactored;

import java.io.IOException;

public interface ParkingLog {
    void log(String line) throws IOException;
}