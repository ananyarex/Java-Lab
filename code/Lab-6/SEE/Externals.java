package SEE;

import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int[] marks;
    protected int[] final_marks;
    int x = 5; // Assuming 5 subjects

    // Constructor to initialize marks and final_marks arrays
    public Externals(String usn, String name) {
        super(usn, name);  // Call the constructor of Internals (and Student)
        this.marks = new int[x];  // Initialize marks array
        this.final_marks = new int[x];  // Initialize final_marks array
    }

    // Method to input external exam marks
    public void get_SEE_marks() {
        Scanner s3 = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Enter marks of external exam for subject " + (i + 1) + ": ");
            marks[i] = s3.nextInt();
        }
    }

    // Method to calculate final marks
    public void calc_final_marks() {
        for (int i = 0; i < x; i++) {
            // Assuming final_marks is the sum of internal and external marks
            final_marks[i] = marks[i] + super.marks[i];
        }
    }

    // Method to display final marks
    public void display_final_marks() {
        // Display the basic student details
        display_details();

        // Display the final marks for each subject
        System.out.println("Final marks for each subject: ");
        for (int i = 0; i < x; i++) {
            System.out.println("Subject " + (i + 1) + ": " + final_marks[i]);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Externals externals = new Externals("1BS19CS001", "John Doe");
        externals.get_CIE_marks();  // Get internal marks
        externals.get_SEE_marks();  // Get external marks
        externals.calc_final_marks();  // Calculate final marks
        externals.display_final_marks();  // Display final marks
    }
}
