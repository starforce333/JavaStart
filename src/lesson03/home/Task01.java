package lesson03.home;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        int max;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = input.nextInt();

        System.out.println("Enter b: ");
        int b = input.nextInt();

        System.out.println("Enter c: ");
        int c = input.nextInt();

        System.out.println("Enter d: ");
        int d = input.nextInt();

        max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Max = " + max);
    }
}
