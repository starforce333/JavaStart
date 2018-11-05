package lesson08.school;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {

        File file = new File("a.txt");

        String text = loadString(file);
        System.out.println(text);
    }

    private static String loadString(File file) {
        String result = "";
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {

        }


        return result;
    }
}
