package lesson06.home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        arr(array);

        System.out.println("Enter a number what you need to find:");
        int num = input.nextInt();
        number(array, num);
        System.out.println(number(array, num));

    }

    private static void arr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }

    private static int number(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }
}




