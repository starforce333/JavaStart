package lesson03.home;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        int allFloor = 9;
        int allEntrance = 4;
        int appOnFloor = 4;
        int floor;
        int entrance;

        int allAp = allFloor * allEntrance * appOnFloor;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();

        if (number <= allAp) {
            entrance = (number - 1) / (allFloor * appOnFloor) + 1;
            System.out.println("The entrance is: " + entrance);

            floor = (number - 1 - (allFloor * appOnFloor * (entrance - 1))) / appOnFloor + 1;
            System.out.println("The floor is: " + floor);

        } else {
            System.out.println("There is no such apartment in the building");
        }

    }


}
