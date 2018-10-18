package lesson03.home;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinate x: ");
        double x = input.nextDouble();

        System.out.println("Enter coordinate y: ");
        double y = input.nextDouble();

        int radius = 4;
        double distance = Math.sqrt(Math.pow(0 - x, 2) + Math.pow(0 - y, 2));

        if (distance <= radius) {
            System.out.println("This point is inside the round");
        } else {
            System.out.println("This point is outside the round");
        }
    }

}
