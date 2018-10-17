package lesson03;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {

        int max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();

        System.out.println("Enter b: ");
        int b = input.nextInt();

        System.out.println("Enter c: ");
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }

        }
        System.out.println("Max = " + max);
    }
}
