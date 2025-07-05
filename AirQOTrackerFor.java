import java.util.Random; // This helps us pretend to get daily air readings.

public class AirQOTrackerFor {

    public static void main(String[] args) {
        System.out.println("--- Daily PM2.5 Levels (Using a 'For' Loop) ---");
        Random airDataMaker = new Random(); // Our fake sensor for daily numbers.

        // We're going through each of the 30 days, one by one.
        for (int dayNumber = 1; dayNumber <= 30; dayNumber++) {
            // Let's pretend to get a PM2.5 reading for the day.
            double pm25Level = 50.0 * airDataMaker.nextDouble();
            System.out.printf("Day %d's PM2.5 reading: %.2f µg/m³%n", dayNumber, pm25Level);
        }
    }
}
The while loop
import java.util.Random; // Still need our fake sensor for daily numbers.

public class AirQOTrackerWhile {

    public static void main(String[] args) {
        System.out.println("\n--- Daily PM2.5 Levels (Using a 'While' Loop) ---");
        Random dataSimulator = new Random(); // Our fake sensor for daily numbers.

        int currentDay = 1; // Start counting our days from day 1.
        
        // Keep going until we hit day 30.
        while (currentDay <= 30) { 
            // Get today's pretend PM2.5 reading.
            double pm25Level = 50.0 * dataSimulator.nextDouble();
            System.out.printf("Reading for Day %d: PM2.5 = %.2f µg/m³%n", currentDay, pm25Level);
            
            currentDay++; // Don't forget to move to the next day, otherwise, we'd loop forever! (Oops!)
        }
    }
}
