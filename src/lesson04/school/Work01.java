package lesson04.school;

public class Work01 {
    public static void main(String[] args) {
        int n = 1;

        // предусловие
       /* while (n <= 10) {
            System.out.println(n);
            n = n + 1;
        }*/
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("SpamEgg");
            } else if (i % 3 == 0) {
                System.out.println("Spam");
            } else if (i % 5 == 0) {
                System.out.println("Egg");
            } else if (i%4==0) {
                continue;
            } else System.out.println(i);
        }
    }
}
