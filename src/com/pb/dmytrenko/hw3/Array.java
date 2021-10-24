package com.pb.dmytrenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        System.out.println("Введите массив целых чисел через пробел, потом нажмите ENTER ");
        Scanner scan = new Scanner(System.in);
        int N = 10;
        int[] array = new int[N];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            // считываем введенный пользователем элемент в массив
            array[i] = scan.nextInt();
        }
        // проходим по всем элементов массива и суммируем каждое число
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);

        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > 0)
                counter += 1;
        }
        System.out.println("Количество положительных элементов массива равна: " + counter);

        bubbleSort(array);

        // печатаем массив после пузырьковой сортировки
        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));
    }

    // метод пузырьковой сортировки
    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) { // измените на > для сортировки по возрастанию
                    temp = num[j];         // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}