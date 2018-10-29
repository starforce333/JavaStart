package lesson06.home;

public class Task02 {
    public static void main(String[] args) {
        int a = 5;
        double b = 6.5;
        String word = "is result";

        System.out.println(concat(a, b, word));
    }

    public static String concat(int a, double b, String c) {
        String con = a + b + " " + c;
        return con;
    }


}


