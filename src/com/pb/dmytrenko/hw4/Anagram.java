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

        // check if length is same
        if(abc.length() == cba.length()) {

            // convert strings to char array
            char[] charArray1 = abc.toCharArray();
            char[] charArray2 = cba.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
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
