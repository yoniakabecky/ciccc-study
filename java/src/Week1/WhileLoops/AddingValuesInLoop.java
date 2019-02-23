package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("I will add up the numbers you give me.");

        while (true) {
            System.out.print("Number: ");
            int num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                System.out.printf("\nThe total is %d.", sum);
                break;
            }
            System.out.println("The tota so far is " + sum);
        }
    }
}
