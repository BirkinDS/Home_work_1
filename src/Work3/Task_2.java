/*Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:*/
//Найти минимальный - максимальный элементы и вывести в консоль.
package Work3;

import java.util.Scanner;
//Первый способ решения
class Task_2_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        // Выводим массив
        System.out.println("\nМассив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Ищем минимальный и максимальный элементы
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\n\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        scanner.close();
    }
}
//Второй способ решения
class Task_2_v2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            // Заполняем массив вручную
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите элемент массива [" + i + "]: ");
                array[i] = scanner.nextInt();
            }
            // Выводим массив
            System.out.println("\nМассив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            // Ищем минимальный и максимальный элементы
            int min = array[0];
            int max = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("\n\nМинимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
            scanner.close();
    }
}