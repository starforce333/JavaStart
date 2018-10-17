package lesson03;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = input.nextInt();

        if (day >= 1 && day <= 31) {
            switch (day) {
                case 1:
                case 8:
                case 15:
                case 22:
                case 29:
                    System.out.println("Monday");
                    break;
                case 2:
                case 9:
                case 16:
                case 23:
                case 30:
                    System.out.println("Thursday");
                    break;
                case 3:
                case 10:
                case 17:
                case 24:
                    System.out.println("Wednesday");
                    break;
                case 4:
                case 11:
                case 18:
                case 25:
                case 31:
                    System.out.println("Thursday");
                    break;
                case 5:
                case 12:
                case 19:
                case 26:
                    System.out.println("Friday");
                    break;
                case 6:
                case 13:
                case 20:
                case 27:
                    System.out.println("Saturday");
                    break;
                case 7:
                case 14:
                case 21:
                case 28:
                    System.out.println("Sunday");
                    break;
            }


        } else {
            System.out.println("Error");
        }
    }
}
