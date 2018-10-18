package lesson03.school;

import java.util.Scanner;

public class Work021 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = input.nextInt();

        if (day >= 1 && day <= 31) {
            switch (day%7) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:

                    System.out.println("Thursday");
                    break;
                case 3:

                    System.out.println("Wednesday");
                    break;
                case 4:

                    System.out.println("Thursday");
                    break;
                case 5:

                    System.out.println("Friday");
                    break;
                case 6:

                    System.out.println("Saturday");
                    break;
                case 0:

                    System.out.println("Sunday");
                    break;
            }


        } else {
            System.out.println("Error");
        }
    }
}
