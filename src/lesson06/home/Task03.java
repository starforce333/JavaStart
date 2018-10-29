package lesson06.home;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter h: ");
        int h = input.nextInt();

        System.out.println("Enter w: ");
        int w = input.nextInt();

        draw(h, w);
    }

    private static void draw(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

