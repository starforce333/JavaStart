package lesson04.home;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter height: ");
        int h = input.nextInt();

        System.out.println("Enter width: ");
        int w = input.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h || j == 1 || j == w) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
