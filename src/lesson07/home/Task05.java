package lesson07.home;

import java.util.Calendar;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Calendar calendarNow = Calendar.getInstance();
//        Date now = calendarNow.getTime();

        Scanner input = new Scanner(System.in);
        System.out.print("Input year: \t");
        int a = input.nextInt();
        System.out.print("Input month: \t");
        int b = input.nextInt();
        System.out.print("Input date: \t");
        int c = input.nextInt();

        Calendar calendarConsole = Calendar.getInstance();
        calendarConsole.set(Calendar.YEAR, a);
        calendarConsole.set(Calendar.MONTH, b - 1);
        calendarConsole.set(Calendar.DAY_OF_MONTH, c);
        System.out.println();

        if (calendarNow.get(Calendar.YEAR) != calendarConsole.get(Calendar.YEAR)) {
            System.out.println("Year : \t" + calendarNow.get(Calendar.YEAR) + " <> " + calendarConsole.get(Calendar.YEAR));
        }
        if (calendarNow.get(Calendar.MONTH) != calendarConsole.get(Calendar.MONTH)) {
            System.out.println("Month : \t" + (calendarNow.get(Calendar.MONTH) + 1) + " <> " + calendarConsole.get(Calendar.MONTH));
        }
        if (calendarNow.get(Calendar.DAY_OF_MONTH) != calendarConsole.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("Day : \t" + calendarNow.get(Calendar.DAY_OF_MONTH) + " <> " + calendarConsole.get(Calendar.DAY_OF_MONTH));
        }

    }
}