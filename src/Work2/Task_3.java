/*Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.*/
package Work2;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Квадраты чисел от 10 до 20:");

        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println(i + " в квадрате = " + square);
        }
    }
}
