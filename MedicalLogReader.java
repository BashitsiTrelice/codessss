import java.io.*;
public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medicalLog.txt"); // File object for medical log
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;
            System.out.println("Medical Log Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + medicalLogFile.getName() + "' not found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}










