package lesson08.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class Task02 {
    public static void main(String[] args) {
        File file = new File("array.txt");

        int[][] array = new int[5][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToFile(array, file);
    }

    private static void writeToFile(int[][] a, File file) {
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                temp += a[i][j] + " ";
            }
            temp += System.lineSeparator();
        }
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.print(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}