package CIE;

import java.util.Scanner;

public class Student {
    protected String usn, name;
    protected int sem;

    // Constructor
    public Student() {
        this.usn = "";
        this.name = "";
        this.sem = 0;
    }

    // Method to input details
    public void get_details() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter USN: ");
        usn = s1.nextLine();
        System.out.println("Enter Name: ");
        name = s1.nextLine();
        System.out.println("Enter Semester: ");
        
        // Handle input for integer value for semester
        while (!s1.hasNextInt()) {
            System.out.println("Please enter a valid integer for Semester: ");
            s1.next(); // Consume the invalid input
        }
        sem = s1.nextInt();
    }

    // Method to display details
    public void display_details() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student = new Student();
        student.get_details();
        student.display_details();
    }
}
