. import static org.junit.Assert.*;
import org.junit.Test;

public class CompanyTest {

    @Test
    public void testScheduleVehicleSuccess() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);
        assertTrue(company.scheduleVehicle(passenger, pickup, destination));
    }

    @Test
    public void testScheduleVehicleFailureWhenNoVehicles() {
        Company company = new Company();
        company.removeAllVehicles(); // Hypothetical method
        Passenger passenger = new Passenger();
        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);
        assertFalse(company.scheduleVehicle(passenger, pickup, destination));
    }
}
