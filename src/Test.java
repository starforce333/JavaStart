import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        String temp = "";
        String rarr = generate(temp);
        String zipp = generate(temp);

        File rar = new File("rar.txt");
        try (PrintWriter pw = new PrintWriter(rar)) {
            pw.print(rarr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File zip = new File("zip.txt");
        try (PrintWriter pw = new PrintWriter(zip)) {
            pw.print(zipp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String generate(String a) {
        String str = "D P" + System.lineSeparator();
        int length = 35;
        String digits = "0123456789";
        String specials = "~=+%^*/()[]{}/!@#$?|";
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + digits + specials;
        for (int i = 1; i < 32; i++) {
            Random rnd = new Random();
            List<String> result = new ArrayList<>();
            Consumer<String> appendChar = s ->
                    result.add("" + s.charAt(rnd.nextInt(s.length())));
            appendChar.accept(digits);
            appendChar.accept(specials);
            while (result.size() < length)
                appendChar.accept(all);
            Collections.shuffle(result, rnd);
            str += i + " " + String.join("", result) + System.lineSeparator();

        }
        System.out.print(str);
        str = str.substring(0, str.lastIndexOf(System.lineSeparator()));
        return str;
    }

}