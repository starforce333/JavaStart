package lesson07.home;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9};
        String standard = Arrays.toString(array);
        System.out.println(standard);

        System.out.println();

        String convert = myString(array);
        System.out.println(convert);
    }

    private static String myString(int[] a) {
        String my = "[";
        for (int i = 0; i < a.length; i++) {
            my = my + a[i] + ", ";
        }
        my = my.substring(0, my.lastIndexOf(','));
        my = my + "]";
        return my;
    }
}