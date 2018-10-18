package lesson03.home;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a = input.nextDouble();

        System.out.println("Enter side b: ");
        double b = input.nextDouble();

        System.out.println("Enter side c: ");
        double c = input.nextDouble();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c || a + c > b || b + c > a) {
                System.out.println("This is RIGHT triangle! :)");
            } else {
                System.out.println("This is WRONG triangle! :(");
            }

        } else
            System.out.println("Side cannot be less than zero!");
    }
}
