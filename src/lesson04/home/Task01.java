package lesson04.home;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else System.out.print("***");
            }
            System.out.println();
        }

    }
}
