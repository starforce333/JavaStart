package lesson05.home;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int a = input.nextInt();

        System.out.println("Enter number of columns: ");
        int b = input.nextInt();

        int[][] mass = new int[a][b];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.println("Enter number for " + i + " line and " + j + " column");
                int num = input.nextInt();
                mass[i][j] = num;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (j == mass[0].length - 1) {
                    System.out.println(mass[i][j] + " ");
                } else
                    System.out.print(mass[i][j] + " ");
            }
        }
    }
}
