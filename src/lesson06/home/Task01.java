package lesson06.home;

public class Task01 {
    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 34, 7, 5, 3, 2, 7, 0, 8, 4, 324, 4, 69, 1,};
        int max = findMax(array);
        System.out.println(max);
    }

    public static int findMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
