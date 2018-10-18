package lesson03.home;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter four-digit number");
        int number = input.nextInt();

        int one = number / 1000;
        int two = number % 1000 / 100;
        int three = number % 100 / 10;
        int four = number % 10;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        if (one + two == three + four) {
            System.out.println("Lucky number!");
        } else {
            System.out.println("Just another ticket number...");
        }

    }
}
