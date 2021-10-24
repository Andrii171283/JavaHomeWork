package com.pb.dmytrenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Угадайте задуманное целое число от 0 до 100");
        System.out.println("Для выхода из программы введите - exit");

        int x = random.nextInt(101);
        System.out.println(+x);


        final int MAX_ATTEMPT = 101;
        int attempt = 0;
        String number = Integer.toString(x);
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(number)) {
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки");
            break;
        }
        System.out.println("Конец игры");

    }
}

