package lesson02;

import java.util.Scanner;

public class task01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five-digit number");
        int number = input.nextInt();

        int one = number/10000;
        System.out.println(one);

        int two = number%10000/1000;
        System.out.println(two);

        int three = number%10000%1000/100;
        System.out.println(three);

        int four = number%10000%1000%100/10;
        System.out.println(four);

        int five = number%10000%1000%100%10;
        System.out.println(five);

    }
}
