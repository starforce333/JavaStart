package lesson03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {

            System.out.println("Year has 365 days!");
        } else
            System.out.println("Year has 366 days. Leap year!");

    }
}

