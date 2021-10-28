package com.pb.dmytrenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.nextLine();
        char[] chahlic = a1.toCharArray();

        chahlic[0] = Character.toUpperCase(chahlic[0]);
        for (int i = 0; i < chahlic.length - 1; i++) {
            if (chahlic[i] == ' ') {
                chahlic[i + 1] = Character.toUpperCase(chahlic[i + 1]);
            }
        }
        a1 = new String(chahlic);
        System.out.println("Решение задачи");
        System.out.println(a1);

    }
}
