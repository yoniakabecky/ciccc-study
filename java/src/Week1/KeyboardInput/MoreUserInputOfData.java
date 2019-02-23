package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!");

        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();

        System.out.print("Grade (9-12): ");
        int grade = scanner.nextInt();

        while (!(grade >= 9 && grade <= 12)) {
            System.out.print("Grade should be 9-12: ");
            grade = scanner.nextInt();
        }

        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Login: ");
        String login = scanner.next();
        System.out.print("GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();

        while (!(gpa >= 0.0 && gpa <= 4.0)) {
            System.out.print("GPA should be 0.0-4.0: ");
            gpa = scanner.nextDouble();
        }

        System.out.println("\n");

        System.out.println("Your information:");
        System.out.println("    Login:  " + login);
        System.out.println("    ID:     " + studentId);
        System.out.println("    Name:   " + lastName + ", " + firstName);
        System.out.println("    GPA:    " + gpa);
        System.out.println("    Grade:  " + grade);

    }
}
