package lesson04.home;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");
        int width = input.nextInt();


        if (width % 2 != 0) {
            for (int i = 1; i <= width; i++) {

                for (int j = 1; j <= width; j++) {

                    if (i >= j && i >= width + 1 - j || i <= j && i <= width + 1 - j) {
                        System.out.print("*");
                    } else System.out.print(" ");

                }
                System.out.println();
            }


        } else System.out.println("Please enter right number");

    }
}
