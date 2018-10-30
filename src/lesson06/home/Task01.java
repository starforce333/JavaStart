package lesson06.home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        arr(array);
        int max = findMax(array);
        System.out.println(max);
    }

    /**
     * Random array
     * @param a <code> int [] </code> Array of integers
     * @return <code> int </code> return random array
     * @author Starforce
     */

    private static void arr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }

    /**
     * Find max
     * @param a <code> int [] </code> Array of integers
     * @return <code> int </code> return max value of integer in array
     * @author Starforce
     */

    private static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}