package lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextInt();

        System.out.println("Circumference = " + 2 * Math.PI * r);
    }
}
