package lesson05.home;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phrase:");
        String phrase = input.nextLine();

        int sum = 0;
        char[] mass = phrase.toCharArray();

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 'b') {
                sum++;
            }

        }
        System.out.println("The number of symbol 'b' is: " + sum);
    }
}

