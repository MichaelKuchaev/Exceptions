package org.exception.homeWork;


import java.util.Scanner;
/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
"Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
*/
public class DivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Введите первое целое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        num2 = scanner.nextInt();

        try {
            division(num1,num2);
            System.out.println("Результат деления: " + (num1 / num2));

        }catch (Exception e){
            System.out.println("Деление на ноль недопустимо!");
        }
    }
    public static void division(int num2, int num1) throws DivisionByZeroException{
        if (num2 == 0){
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}