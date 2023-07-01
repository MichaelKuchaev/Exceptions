package org.exception.homeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static double calculatePower(double a, double b) throws PowerCalculator.InvalidInputException {
        if (a == 0 || b < 0) {
            throw new PowerCalculator.InvalidInputException("Ввели недопустимые значения");
        }
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите число основания: ");
            double b = getInputNumber("Введите число степени: ");

            double result = calculatePower(a, b);
            System.out.println("Результат возведения в степень: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        } catch (PowerCalculator.InvalidInputException e) {
            handleDivisionByZeroException(e);
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void handleDivisionByZeroException(PowerCalculator.InvalidInputException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}
