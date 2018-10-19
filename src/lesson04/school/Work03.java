package lesson04.school;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter h: ");
        int h = input.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h + 1; j++) {

                if (j <= h - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
