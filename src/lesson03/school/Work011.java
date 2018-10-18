package lesson03.school;

import java.util.Scanner;

public class Work011 {
    public static void main(String[] args) {

        int max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();

        System.out.println("Enter b: ");
        int b = input.nextInt();

        System.out.println("Enter c: ");
        int c = input.nextInt();

        max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
                max = c;
            }

        System.out.println("Max = " + max);
    }
}
