package com.pb.dmytrenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x;
        System.out.println("Введите число и нажмите Enter:");
    x = scan.nextInt();

       if (x > 0) {
            if (x < 15) {
                System.out.print("Интервал [0 -14]");
            }
        }
        if (x > 14) {
            if (x < 36) {
                System.out.print("Интервал [15 -35]");
            }
        }
        if (x > 35) {
            if (x < 51) {
                System.out.print("Интервал [36 -50]");
            }
        }
        if (x > 50) {
            if (x < 101) {
                System.out.print("Интервал [51 -100]");
            }
        }
        if (x > 100) {
            System.out.print("Такого интервала небыло в задании )))");

        }


    }
}