//package lesson08.home;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Task04 {
//    public static void main(String[] args) {
//
//        File file = new File("array.txt");
//        String[][] text = loadString(file);
//        //  System.out.println(text.toString());
//        //System.out.println(text.toCharArray());
//        System.out.println(file.length());
//        System.out.println(file.toString());
//        System.out.println(Arrays.toString(text));
//
//    }
//
//    private static String[][] loadString(File file) {
//        String[][] result = new String[size(file)][1];
//        try (Scanner sc = new Scanner(file)) {
//            for (int i = 0; i < file.length(); i++) {
//                for (int j = 0; j < file.length(); j++) {
//                    for (; sc.hasNextLine(); ) {
//                        result[i][j] = sc.next();
////                        System.out.println(sc.next());
//                        //result[i][j] = sc.nextLine() + System.lineSeparator();
//                    }
//                }
//            }
//        } catch (IOException e) {
//
//        }
//        return result;
//    }
//
//    private static int size(File file) {
//        int size = 0;
//        String str ="";
//        try (Scanner sc = new Scanner(file)) {
//            while (file. != System.lineSeparator()) {
//                size++;
//            }
//
//        } catch (IOException e) {
//
//        }
//        System.out.println();
//        System.out.println(size);
//        System.out.println();
//        return size;
//    }
//}