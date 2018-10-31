package lesson07.school;

import java.util.Calendar;
import java.util.Date;

public class Work02 {
    public static void main(String[] args) {

        Calendar calend = Calendar.getInstance();

        int day = calend.get(Calendar.DAY_OF_MONTH);
        int dayY = calend.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);
        System.out.println(dayY);

        calend.set(Calendar.DAY_OF_MONTH, day + 75);
        System.out.println(calend);

        calend.set(1988, 9, 21);

        Date date = calend.getTime();

        System.out.println(date);
    }
}
