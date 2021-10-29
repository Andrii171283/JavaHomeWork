package com.pb.dmytrenko.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String abc = scanner.nextLine();
        System.out.println("Введите анограмму");
        String cba = scanner.nextLine();

        abc = abc.toLowerCase();
        cba = cba.toLowerCase();


        if(abc.length() == cba.length()) {


            char[] charArray1 = abc.toCharArray();
            char[] charArray2 = cba.toCharArray();


            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(abc + " и " + cba + ": анограмма");
            }
            else {
                System.out.println(abc + " и " + cba + ": не анограмма");
            }
        }
        else {
            System.out.println(abc + " и " + cba + ": не анограмма");
        }
    }
}
