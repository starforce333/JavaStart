package lesson07.school;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work01 {
    public static void main(String[] args) {
        //long t = 1234567891011L;
        Date myDate = new Date();
        SimpleDateFormat one = new SimpleDateFormat("dd MM yyyy");
        SimpleDateFormat two = new SimpleDateFormat("dd/MMMM/yyyy");
        //1.01.1970

        String myDay = "21 10 1988";

        try {
            myDate = one.parse(myDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String result = one.format(myDate);
        System.out.println(result);

        result = two.format(myDate);
        System.out.println(result);

        System.out.println(myDate.getTime());

    }
}
