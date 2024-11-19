Conversation opened. 1 unread message.

Skip to content
Using BMS College of Engineering Mail with screen readers
Enable desktop notifications for BMS College of Engineering Mail.
   OK  No thanks
19 of 531
Fwd:
Inbox

Aaron B Ajay <aaronb.cs23@bmsce.ac.in>
Attachments
Nov 13, 2024, 3:53 PM (6 days ago)
to me



---------- Forwarded message ---------
From: Aaron B Ajay <aaronb.cs23@bmsce.ac.in>
Date: Wed, 13 Nov 2024 at 10:20 AM
Subject:
To: Aaron B Ajay <aaronb.cs23@bmsce.ac.in>



 5 Attachments
  •  Scanned by Gmail
package SEE;
import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int[] seeMarks = new int[5];
    protected int[] finalMarks = new int[5];

    public void inputSEEmarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE Marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            seeMarks[i] = sc.nextInt();
        }
    }

    public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + seeMarks[i];
        }
    }

    public void displayFinalMarks() {
        displayStudentDetails();
        System.out.println("Final Marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}
Externals.java
Displaying Bank.java.
