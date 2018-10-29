package lesson06.home;


public class Task07 {
    public static void main(String[] args) {

        int max = 0;
        int one = 0;
        int two = 0;
        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {
                int num = i * j;
                if (pall(num) && num > max) {
                    max = num;
                    one = i;
                    two = j;
                }
            }
        }
        System.out.println(one + " * " + two + " = " + max);
    }

    private static boolean pall(int a) {
        char[] mass = String.valueOf(a).toCharArray();
        boolean value = true;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != mass[mass.length - 1 - i]) {
                value = false;
            }
        }
        return value;
    }
}