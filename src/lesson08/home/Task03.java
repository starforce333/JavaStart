package lesson08.home;

import java.io.File;

public class Task03 {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] files = folder.listFiles();

        dir(files);
    }

    private static void dir(File[] file) {
        for (int i = 0; i < file.length; i++) {
            if (file[i].isDirectory()) {
                System.out.println(file[i]);
            }
        }

    }
}