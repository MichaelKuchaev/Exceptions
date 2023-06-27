package org.exception.homeWork;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        personsAge();
    }

    public static void personsAge() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите Ваш возраст: ");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= 0) {
                System.out.println("Ваш возраст равняется: " + num);
            } else {
                System.out.println("Введите положительное число!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод!");
        }
        scanner.close();
    }
}
