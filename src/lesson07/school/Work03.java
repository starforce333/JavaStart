package lesson07.school;

public class Work03 {
    public static void main(String[] args) {

//        System.out.printf("%.2f", Math.PI);
//        System.out.println();

//        String result = String.format("%.2f", Math.PI);
        System.out.println(doubleToString(Math.PI, 8));

    }

    public static String doubleToString(double a, int n) {
        String result = String.format("%." + n + "f", a);
        return result;
    }
}
