public class Patient {
    String patientID;
    String allergyNotes;
    public Patient(String patientID, String allergyNotes) {
        this.patientID = patientID; 
        this.allergyNotes = allergyNotes; 
    }
    public void display() {
        System.out.println("Patient ID: " + patientID + ", Allergies: " + allergyNotes);
    }
    public static void main(String[] args) {
        Patient p = new Patient("P001", "Penicillin");
        p.display();
    }
}

