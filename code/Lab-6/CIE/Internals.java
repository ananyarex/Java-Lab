package CIE;

import java.util.Scanner;

public class Internals extends Student {
    protected int[] marks;
    int n = 5; // assuming there are 5 subjects for now
    
    // Constructor to initialize the inherited fields and the marks array
    public Internals(String usn, String name) {
        super();  // Calling the parent constructor (Student)
        this.usn = usn;
        this.name = name;
        this.marks = new int[n]; // Initialize the marks array with size 5
    }

    // Method to input marks
    public void get_CIE_marks() {
        Scanner s2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = s2.nextInt();
        }
    }

    // Method to display marks
    public void display_marks() {
        System.out.println("Marks for the student " + name + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Internals intern = new Internals("1BS19CS001", "John Doe");
        intern.get_CIE_marks();
        intern.display_marks();
    }
}
