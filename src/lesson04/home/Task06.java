package lesson04.home;


public class Task06 {
    public static void main(String[] args) {

        boolean number;
        String list = "";


        for (int i = 2; i <= 100; i++) {

            number = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    number = false;
                }
            }

            if (number) {
                list = list + number + ";";

            }

        }

        System.out.println(list);

    }

}