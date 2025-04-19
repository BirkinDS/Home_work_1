/*Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения остатка от деления (операция
выглядит так: '% 2').*/
package Work2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Значение четное");
        } else {
            System.out.println("Значение нечетное");
        }
        scanner.close();
    }
}
