/*Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:*/
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
package Work3;

import java.util.Scanner;
//Первый способ решения
class Task_1_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // Заполняем массив данными, введёнными пользователем
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        // Вывод массива в прямом порядке
        System.out.println("\nЭлементы массива в прямом порядке:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Вывод массива в обратном порядке
        System.out.println("\n\nЭлементы массива в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
//Второй способ решения
class Task_1_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // Заполняем массив случайными числами от 0 до 9
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        // Вывод массива в прямом порядке
        System.out.println("\nЭлементы массива в прямом порядке:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Вывод массива в обратном порядке
        System.out.println("\nЭлементы массива в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}