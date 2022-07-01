package Validation;

import java.util.Scanner;

public class inputValidation {
    public static final Scanner sc = new Scanner(System.in);

    public static int Int() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            return Int();
        }
    }

    public static String String() {
        try {
            return sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            return String();
        }
    }

    public static double Double() {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            return Double();
        }
    }
}
