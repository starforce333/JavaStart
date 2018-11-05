package lesson08.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter h");
        int h = sc.nextInt();

        System.out.println("Enter w");
        int w = sc.nextInt();


        String str = draw(h, w);

        File file = new File("draw.txt");

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static String draw(int a, int b) {
        String temp = "";
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                Random r = new Random();
                if (j % 2 == 0) {
                    char c = (char) (r.nextInt(26) + 'a');
                    System.out.print(c);
                    temp += c;
                } else {
                    char c = (char) (r.nextInt(26) + 'A');
                    System.out.print(c);
                    temp += c;
                }
            }
            System.out.println();
            temp += System.lineSeparator();
        }
        return temp;
    }
}


//        1) Напишите метод для считывания двухмерного массива из
//        файла (размер массива заранее неизвестен, определите его
//        сами на основе данных в файле).

//        2) Считайте из текстового файла текст на английском языке и
//        выведите статистику по частоте использования букв в тексте
//        (т. е. буква — количество использований), причем первыми
//        должны выводиться буквы используемы чаще всего.

//        3) Напишите метод для создания в файле ASCII — арта, т. е.
//        фигуры размером 40х40 символов заполненных  символами
//        образующими узор.
