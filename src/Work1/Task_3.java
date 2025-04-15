package Work1;

public class Task_3 {
    public static void main(String[] args) {
        //Задаем значение переменных
        int n = 126;
        //Пишем формулу для вычисления значений
        int sum1 = n / 100;
        int sum2 = (n / 10) % 10;
        int sum3 = n  % 10;
        int sum4 = sum1 + sum2 + sum3;
        //Выводим результат вычисления
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
