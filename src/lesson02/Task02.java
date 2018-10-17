package lesson02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = input.nextInt();

        System.out.print("Enter side b: ");
        double b = input.nextInt();

        System.out.print("Enter side c: ");
        int c = input.nextInt();

        double perimetr = a + b + c;

        System.out.println("Square = " + Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c)));

    }
}
