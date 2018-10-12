package lesson02;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = input.nextInt();

        System.out.print("Enter side b: ");
        int b = input.nextInt();

        System.out.print("Enter side c: ");
        int c = input.nextInt();

        int perimetr = a + b + c;

        System.out.println("Square = " + Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c)));

    }
}
