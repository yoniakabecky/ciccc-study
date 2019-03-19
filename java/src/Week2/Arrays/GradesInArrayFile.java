package Week2.Arrays;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class GradesInArrayFile {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] grades = new int[5];

        System.out.print("Name (first last): ");
        String userName = sc.nextLine();
        System.out.print("Filename: ");
        String fileName = sc.nextLine();

        System.out.println("\nHere are your randomly-selected grades (hope you pass):");

        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.println(userName);
            for (int i = 0; i < grades.length; i++) {
                grades[i] = rd.nextInt(100) + 1;
                System.out.printf("Grade %d: %d\n", i, grades[i]);
                pw.print(grades[i] + " ");
            }
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("\nData saved in " + fileName + ".");
    }

}
