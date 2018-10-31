package lesson07.home;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many lines do you need?");
        int lines = input.nextInt();

        for (int i = 2; i < lines; i++) {
            System.out.println(piLines(Math.PI, i));

        }
    }

    private static String piLines(double a, int n) {
        String result = String.format("%." + n + "f", a);
        return result;
    }
}