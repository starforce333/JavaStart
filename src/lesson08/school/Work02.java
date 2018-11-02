package lesson08.school;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Work02 {
    public static void main(String[] args) {

        String[] lastNames = new String[]{"Solo", "Skywalker", "Vader", "Yoda", "R2D2"};
        String[] names = new String[]{"Han", "Luke", "Darth", "Master", "Astrodroid"};
        int[] scores = new int[]{7, 9, 3, 4, 11};

        File file = new File("c.csv");
        String report = createReport(lastNames, names, scores);
        saveStringToFile(report, file);


    }

    private static void saveStringToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String createReport(String[] lastNames, String[] names, int[] scores) {
        String report = "";
        for (int i = 0; i < scores.length; i++) {
            report += lastNames[i] + ";" + names[i] + ";" + scores[i];
            report += System.lineSeparator();
        }
        return report;
    }

}