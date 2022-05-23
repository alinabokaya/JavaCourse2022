package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
//    Найти произведение элементов, кратных 3.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаём объект типа Scanner
        Random random = new Random(); // Создаём объект типа Random
        System.out.println("Длина массива: ");
        int n = sc.nextInt();// Вводим длину массива с клавиатуры
        int result = 1;

        Integer[] array = new Integer[n]; // Cоздаём одномерный массив длиной = n

        // Наполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50); // заполняем массив случайными числами от 0 до 50
        }

        // Выводим массив на экран
        System.out.print("Массив без изменений: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Находим произведение элементов кратных 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                result = result * array[i];
            }
        }
        System.out.println("\nПроизведение элементов кратных 3: " + result);
    }
}
