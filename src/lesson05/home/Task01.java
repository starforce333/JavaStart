package lesson05.home;

public class Task01 {
    public static void main(String[] args) {

        int sum = 0;
        int[] mass = {0, 5, 2, 4, 7, 1, 3, 19};
        for (int mas : mass) {
            if (mas % 2 != 0) {
                sum = sum + 1;
            }


        }

        System.out.println("There are " + sum + " odd numbers");

    }

}

