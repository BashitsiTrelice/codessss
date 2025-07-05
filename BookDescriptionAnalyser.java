import java.util.Scanner;       // We'll use this to read your input.
import java.util.regex.Matcher; // These two help us find specific words.
import java.util.regex.Pattern;

public class BookDescriptionAnalyzer {

    public static void main(String[] args) {
        // Get ready to listen to what the librarian types.
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there! Let's check a book description for you.");
        System.out.println("Please paste or type the full description now (then press Enter):");

        // We're taking in the entire line of text the librarian provides.
        String bookDescription = inputReader.nextLine();

        // Now, we prepare our search tool.
        // "\\buganda\\b" means we're looking for the exact word "uganda".
        // The "\\b" bits ensure we only count "Uganda" as a whole word,
        // not if it's part of "Ugandan" or "Buganda".
        // Pattern.CASE_INSENSITIVE tells it to ignore big letters or small letters.
        Pattern ugandaWordFinder = Pattern.compile("\\buganda\\b", Pattern.CASE_INSENSITIVE);

        // We set up our finder to look specifically within the book description.
        Matcher foundMatches = ugandaWordFinder.matcher(bookDescription);

        int countOfUganda = 0; // This will keep track of how many times we find it.

        // We'll keep searching through the text as long as we find the word.
        while (foundMatches.find()) {
            countOfUganda++; // Every time we find it, we add one to our tally.
        }

        System.out.println("\n--- Analysis Complete ---");
        System.out.println("Alright, I've checked the description thoroughly.");

        // Now, let's tell the librarian what we found.
        if (countOfUganda == 0) {
            System.out.println("Good news, 'Uganda' (in any form) didn't appear in this description.");
        } else if (countOfUganda == 1) {
            System.out.println("The word 'Uganda' showed up just once.");
        } else {
            System.out.println("I found the word 'Uganda' a total of " + countOfUganda + " times.");
        }

        // It's polite to close the reader when we're done with it.
        inputReader.close();
    }
}
