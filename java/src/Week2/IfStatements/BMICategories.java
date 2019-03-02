package Week2.IfStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your height(m): ");
        double height = sc.nextDouble();
        System.out.print("Your weight(kg): ");
        int weight = sc.nextInt();

        double BMI = weight / (height * height);

        printCategories(BMI);
    }

    private static void printCategories(double BMI) {
        System.out.printf("\nYour BMI is %.2f\n", BMI);
        if (BMI < 15.0) {
            System.out.println("BMI Category: very severely underweight");
        } else if (BMI >= 15.0 && BMI <= 16.0) {
            System.out.println("BMI Category: severely underweight");
        } else if (BMI >= 16.1 && BMI <= 18.4) {
            System.out.println("BMI Category: underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI Category: normal weight");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("BMI Category: overweight");
        } else if (BMI >= 30.0 && BMI <= 34.9) {
            System.out.println("BMI Category: moderately obese");
        } else if (BMI >= 35.0 && BMI <= 39.9) {
            System.out.println("BMI Category: severely obese");
        } else {
            System.out.println("BMI Category: very severely (or \"morbidly\") obese\n");
        }
    }
}
