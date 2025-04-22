/*Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
package Work2;

public class Task_4 {
    public static void main(String[] args) {
        int number = 7;

        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }
}
