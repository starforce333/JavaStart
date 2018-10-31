package lesson07.home;

import java.util.Calendar;
import java.util.Date;

public class Task01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Date dateNow = calendar.getTime();
        long now = calendar.getTimeInMillis();
        System.out.println(dateNow);

        int monthAgo = calendar.get(Calendar.MONTH) - 1;
        calendar.set(Calendar.MONTH, monthAgo);

        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            int dayAgo = calendar.get(Calendar.DAY_OF_MONTH) - 1;
            calendar.set(Calendar.DAY_OF_MONTH, dayAgo);
        }

        Date dateAgo = calendar.getTime();
        long ago = calendar.getTimeInMillis();
        System.out.println(dateAgo);

        System.out.println("The difference in millis is: " + (now - ago));

    }
}