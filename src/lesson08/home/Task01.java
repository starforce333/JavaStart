package lesson08.home;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phrase");
        System.out.println("To finish and write to file enter '.' without quotes");

        String check = sc.nextLine();
        String line = "";
        String stop = ".";

        while (!check.equals(stop)) {
            line += check + System.lineSeparator();
            check = sc.nextLine();
        }

        File notepad = new File("notepad.txt");
        System.out.println(line);
        saveStringToFile(line, notepad);
    }

    private static void saveStringToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}