package utils;

import java.util.Scanner;

public class Utils {
    public static int enterIntValue(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.print(message + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }
}
