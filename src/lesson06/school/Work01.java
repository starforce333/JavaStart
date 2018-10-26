package lesson06.school;

public class Work01 {
    ////// можно юзать метод тут

    public static void main(String[] args) {

        int c = 5;
        int d = 7;
        int e = sum(c, d) + 5 + sum(1, 2, 3);
        System.out.println(e);

        draw('$', 5);
        draw('$', 9);
        draw('$', 14);
    }

    public static void draw(char sym, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(sym);
        }
        System.out.println();
    }

    /**
     * Get sum of two numbers.
     * @param a <code> int </code> First integer
     * @param b <code> int </code> Second integer
     * @return <code> int </code> return sum of first and second
     * @author Starforce
     */

    public static int sum(int a, int b) {
        int summa = a + b;
        return summa;
    }

    public static int sum(int a, int b, int c) {
        int summa = a + b + c + sum(5, 6);
        return summa;
    }

////// можно юзать метод тут
}
