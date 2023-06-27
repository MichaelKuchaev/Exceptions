package org.exception.homeWork;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        divisionByZero();
    }

    public static void divisionByZero(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Введите первое целое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе целое число: ");
            int num2 = scanner.nextInt();
            System.out.println("Результат деления: " + (num1 / num2));
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль недопустимо!");
        }
        scanner.close();
    }
}
