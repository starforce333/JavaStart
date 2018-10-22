package lesson04.home;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter height: ");
        int height = input.nextInt();
        int length = height * 2 - 1;
        int stars = 0;

        for (int i = 1; i <= length; ) {
            System.out.print("*");
            stars++;

            if (stars >= i || stars >= height * 2 - i) {

                System.out.println();
                i++;
                stars = 0;
            }

        }

    }

}
