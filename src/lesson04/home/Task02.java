package lesson04.home;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int factorial = 1;


        if (num > 4 && num < 16) {
            for (int i = 0; i < (num - 1); i++) {
                factorial = factorial * (num - i);
            }

            System.out.println("Factorial of " + num + " is: " + factorial);

        } else System.out.println("Enter number between 4 and 16.");
    }
}
