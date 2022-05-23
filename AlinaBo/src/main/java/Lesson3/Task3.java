package Lesson3;

import java.util.Random;

public class Task3 {
//    Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//    это количество на экран на отдельной строке.

    public static void main(String[] args) {

        Random random = new Random(); // Создаём объект типа Random
        Integer[] array = new Integer[15]; // создаём одномерный массив длиной = 15
        int evenCount = 0;

        // Наполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99); // заполняем массив случайными числами от 0 до 99
        }

        // Выводим массив на экран
        System.out.print("Массив без изменений: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Узнаём количество чётных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount = evenCount +1;
            }
        }
        System.out.println("\nКоличество чётных = " + evenCount);



    }
}
