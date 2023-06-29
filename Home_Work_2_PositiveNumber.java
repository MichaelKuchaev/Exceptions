package org.exception.homeWork;

import java.util.Scanner;


/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением
"Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
*/
public class PositiveNumber {
    public static void main(String[] args) throws InvalidNumberException {
        testNum();
    }

    public static void testNum() {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Введите любое целое положительное число: ");
            num = scanner.nextInt();
            if (num > 0) {
                System.out.println("Число корректно");
                break;
            } else {
                System.out.println("Некорректное число!");
                break;
            }
        }scanner.close();
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}