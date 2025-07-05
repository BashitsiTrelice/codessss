import java.util.Arrays;   // We'll need this to sort our numbers.
import java.util.Random;   // To get our random air quality figures.

// A simple program to check air quality data, like AirQO might for NEMA.
public class CityAirMonitor {

    // This is where our program kicks off its work.
    public static void main(String[] args) {
        System.out.println("--- Kampala Air Quality Report Initiated ---");

        // Part I: Gathering our 30 daily air quality numbers.
        // We're looking for numbers between 1 and 300, simulating AQI.
        final int observationDays = 30; // Just sticking to the 30 days.
        int[] dailyAirNumbers = new int[observationDays]; // A simple container for our readings.
        Random numberSpinner = new Random(); // Our little machine for random values.

        System.out.println("\nCollecting " + observationDays + " simulated daily AQI readings:");
        for (int i = 0; i < observationDays; i++) {
            // Get a random number from 1 to 300. Nice and simple.
            int singleDayAQI = numberSpinner.nextInt(300) + 1;
            dailyAirNumbers[i] = singleDayAQI;
            System.out.print(singleDayAQI + " "); // Show them as we get them.
            if ((i + 1) % 10 == 0) { // Just for neatness, a new line now and then.
                System.out.println();
            }
        }
        System.out.println("\nAll readings recorded. Phew!");

        // Part II: Figuring out the "middle" air quality value (the Median).
        System.out.println("\n--- Calculating the Median Air Quality ---");

        // To find the middle, we first need to put all our numbers in order. No skipping around!
        Arrays.sort(dailyAirNumbers);
        System.out.println("Readings, now in order: " + Arrays.toString(dailyAirNumbers)); // Just so we can see the sorted list.

        double middleAirValue;
        // Since we have an even number of days (30), the median isn't just one number.
        // It's the average of the two numbers right in the middle.
        // For 30 items (remember, they start counting from zero), the middle ones are at position 14 and 15.
        middleAirValue = (dailyAirNumbers[observationDays / 2 - 1] + dailyAirNumbers[observationDays / 2]) / 2.0;

        System.out.printf("The typical (median) AQI for this period is: %.1f%n", middleAirValue);


        // Part III: Counting how many days were really bad (Hazardous).
        // Anything above 200 is considered quite rough for AQI.
        System.out.println("\n--- Spotting Hazardous Air Days ---");

        int badAirDayCount = 0; // Our tally for the really poor air days.
        StringBuilder terribleDaysList = new StringBuilder(); // To list out those specific bad numbers.

        // Let's go through each day's reading and check if it's too high.
        for (int aqiFigure : dailyAirNumbers) {
            if (aqiFigure > 200) { // Is this day's AQI really high? Like, dangerously high?
                badAirDayCount++; // Yep, add it to our count.
                terribleDaysList.append(aqiFigure).append(" "); // And make a note of the specific reading.
            }
        }

        System.out.println("Total 'hazardous' days (AQI above 200): " + badAirDayCount);
        if (badAirDayCount > 0) {
            System.out.println("Those particular high readings were: [" + terribleDaysList.toString().trim() + "]");
        } else {
            System.out.println("Good news! No extremely hazardous days recorded in this simulated batch. Keep it up, Kampala!");
        }

        System.out.println("\n--- Report Concluded ---");
        System.out.println("Hope this helps NEMA and AirQO keep Kampala smart and breathing easy!");
    }
}
