package lesson04.home;


public class Task06 {
    public static void main(String[] args) {

        boolean number;

        for (int i = 2; i <= 100; i++) {

            number = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    number = false;
                }
            }

            if (number) {
                System.out.println(i);

            }

        }

    }

}