package MiniProject1;

import java.util.*;


public class InputCollector {

    public static String getUserInput(String prompt, boolean isRequired) {
        Scanner sc = new Scanner(System.in);

        if (isRequired) {
            while (true) {
                System.out.println(prompt);
                String userInput = sc.nextLine();
                if (!userInput.equals("")) return userInput;
                System.out.println("This section is required. Please enter.");
            }
        } else {
            System.out.println(prompt);
            return sc.nextLine();
        }
    }


    public static String getPhoneNumber(String prompt, boolean isRequired) {
        while (true) {
            String userInput = getUserInput(prompt, isRequired);

            if (userInput.matches("\\d{3}-\\d{3}-\\d{4}") ){
                return userInput;
            }
            if (userInput.matches("\\d+") && userInput.length() == 10) {
                userInput = userInput.substring(0, 3) + "-" +
                        userInput.substring(3, 6) + "-" + userInput.substring(6, 10);
                return userInput;
            }
            if (!isRequired && userInput.equals(""))
                return userInput;
            System.out.println("Please enter valid phone number (10 digits)");
        }
    }


    public static int getUserInputAsInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println(prompt);
            try {
                option = sc.nextInt();
                if(option >= min && option <= max) {
                    return option;
                } else {
                    System.out.println("-- Not Found -- Please enter the number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("-- Invalid input -- Please enter the number.");
                sc.next();
            } catch (InputMismatchException e) {
                System.out.println("-- Invalid input -- Please enter the number only.");
                sc.next();
            }
        }
    }

}
