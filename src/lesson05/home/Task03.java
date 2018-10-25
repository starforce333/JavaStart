package lesson05.home;

import java.util.Arrays;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {

        int[] massA = new int[15];
        Random rn = new Random();
        for (int i = 0; i < massA.length; i++) {
            massA[i] = rn.nextInt(20);
        }

        System.out.println("massA: " + Arrays.toString(massA));
        System.out.println();

        int[] massB = Arrays.copyOf(massA, 30);
        System.out.println("massB: " + Arrays.toString(massB));
        System.out.println();

        for (int i = 0; i < massA.length; i++) {
            massB[i + massA.length] = massA[i] * 2;
        }

        System.out.println("massB: " + Arrays.toString(massB));
    }
}