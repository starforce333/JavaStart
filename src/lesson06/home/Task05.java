package lesson06.home;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        System.out.println("There are " + count(sentence) + " words");
    }

    private static int count(String a) {
        String[] b = a.split("[ ]");
        return b.length;
    }
}


//  5) Напишите метод который вернет количество слов в строке текста.
//    int words (String text)
////разделитель "Пробел"