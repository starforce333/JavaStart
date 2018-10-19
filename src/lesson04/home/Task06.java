package lesson04.home;


public class Task06 {
    public static void main(String[] args) {


        for (int i = 100; i >= 2; i--) {

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0 && j < i) {
                    System.out.println("null");

                } else System.out.println(i);

            }
        }
    }

}
