package utils;

import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int enterIntValue(String message, int min, int max) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a value between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static double enterDoubleValue(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static String enterStringValue(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
