import SEE.Externals;
import java.util.Scanner;

class Run {
    public static void main(String args[]) {
        int num;
        Scanner s4 = new Scanner(System.in);

        System.out.println("Total Students: ");
        num = s4.nextInt();

        // Array of Externals objects (since Externals has all the required methods)
        Externals[] students = new Externals[num];

        // Loop through each student
        for (int i = 0; i < num; i++) {
            // Prompt for student details (USN and Name)
            Scanner input = new Scanner(System.in); // To handle input for each student
            System.out.println("Enter USN for student " + (i + 1) + ": ");
            String usn = input.nextLine();
            System.out.println("Enter Name for student " + (i + 1) + ": ");
            String name = input.nextLine();

            // Create an Externals object for each student
            students[i] = new Externals(usn, name);

            // Get details and marks for each student
            students[i].get_details();  // Gets general details
            students[i].display_details();  // Displays general details
            students[i].get_CIE_marks();  // Get internal marks (CIE)
            students[i].get_SEE_marks();  // Get external marks (SEE)
            students[i].calc_final_marks();  // Calculate final marks
            students[i].display_final_marks();  // Display final marks
        }
    }
}
