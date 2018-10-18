package lesson03.home;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter six-digit number");
        int number = input.nextInt();

        int one = number / 100000;
        int two = number % 100000 / 10000;
        int three = number % 10000 / 1000;
        int four = number % 1000 / 100;
        int five = number % 100 / 10;
        int six = number % 10;

        if (one == six && two == five && three == four) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not palindrome...");
        }
    }
}
