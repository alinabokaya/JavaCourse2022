package tasks_from_lesha;

import java.util.Scanner;

public class Task1 {
//    мне нужен кусок кода, который примет на ввод целое число (n)
//    и выведет ряд чисел Фибоначчи, количество чисел в последовательности
//    равно n. Число n пользователь вводит самостоятельно в консоли
//    (см класс Scanner), программа содержит какое-то приглашение к вводу
//    (тип введите целое число), формат вывода последовательности на ваш вкус

    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число n: ");
        n = scanner.nextInt();

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("Ряд чисел Фибоначчи: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

}
