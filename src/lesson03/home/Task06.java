package lesson03.home;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        double xA = 0;
        double xB = 4;
        double xC = 6;
        double yA = 0;
        double yB = 4;
        double yC = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        double xP = input.nextDouble();

        System.out.println("Enter y: ");
        double yP = input.nextDouble();

        double first = (xA - xP) * (yB - yA) - (xB - xA) * (yA - yP);
        double second = (xB - xP) * (yC - yB) - (xC - xB) * (yB - yP);
        double third = (xC - xP) * (yA - yC) - (xA - xC) * (yC - yP);

        if (first >= 0 && second >= 0 && third >= 0 || first <= 0 && second <= 0 && third <= 0) {
            System.out.println("This point is inside the triangle! :)");
        } else {
            System.out.println("This point is outside the triangle! :(");
        }
    }
}


