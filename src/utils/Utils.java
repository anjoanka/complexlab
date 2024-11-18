package utils;

import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int enterIntValue(String message, int min, int max) {
        int value;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }

    public static double enterDoubleValue(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Try again: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static String enterStringValue(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
