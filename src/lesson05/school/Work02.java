package lesson05.school;

import java.util.Arrays;
import java.util.Random;

public class Work02 {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] pay = new int[12];

        for (int i = 0; i < pay.length; i++) {
            pay[i] = 10000 + rn.nextInt(10000);      /////??????????
        }
        System.out.println(Arrays.toString(pay));

        int sum = 0;
        for (int i = 0; i < pay.length; i++) {       ////?????????????
            sum = sum + pay[i];
        }

        System.out.println("Average = " + sum / pay.length);

        int[] b = Arrays.copyOfRange(pay, 1, 5);
        System.out.println();
        System.out.println(Arrays.toString(b));
        System.out.println();
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        for (int i : pay) {
            System.out.println(i + " ");
        }
    }
}
