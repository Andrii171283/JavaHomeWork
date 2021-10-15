package com.pb.dmytrenko.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char sign = getOperation();
        int result = calc(operand1,operand2,sign);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию вычисления:");
        char sign;
        if(scanner.hasNext()){
            sign = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            sign = getOperation();
        }
        return sign;
    }

    public static int calc(int operand1, int operand2, char operation){
        int sign;
        switch (operation){
            case '+':
                sign = operand1+operand2;
                break;
            case '-':
                sign = operand1-operand2;
                break;
            case '*':
                sign = operand1*operand2;
                break;
            case '/':
                if (operand2 ==0) {
                    System.out.println("На 0 делить нельзя!");
                }
                sign = operand1/operand2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                sign = calc(operand1, operand2, getOperation());
        }
        return sign;
    }
}
