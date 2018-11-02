package lesson08.school;

import java.io.File;
import java.io.IOException;

public class Work01 {
    public static void main(String[] args) {

        File fileOne = new File("a.txt");
        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File folderOne = new File("AAA");
        folderOne.mkdirs();

        File fileTwo = new File(folderOne, "b.txt");
        try {
            fileTwo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileOne.delete();
        fileTwo.delete();
        folderOne.delete();


        File myFolder = new File(".");

        File[] files = myFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
