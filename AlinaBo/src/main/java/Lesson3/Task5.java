package Lesson3;

import java.util.Random;

public class Task5 {
//    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//    арифметическое элементов каждого массива и сообщите, для какого из
//    массивов это значение оказалось больше (либо сообщите, что их средние
//    арифметические равны).

    public static void main(String[] args) {
        Random random = new Random(); // Создаём объект типа Random
        Integer[] array1 = new Integer[5]; // создаём одномерный массив длиной = 5
        Integer[] array2 = new Integer[5]; // создаём одномерный массив длиной = 5
        double sumArray1 = 0;
        double sumArray2 = 0;
        double averageSumArray1, averageSumArray2;

        // Наполнение 1го массива случайными числами
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15); // заполняем массив случайными числами от 0 до 15
        }

        // Выводим 1ый массив на экран
        System.out.print("Массив без изменений №1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Наполнение 2го массива случайными числами
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(15); // заполняем массив случайными числами от 0 до 15
        }

        // Выводим 2ой массив на экран
        System.out.print("\nМассив без изменений №2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        //Считаем среднее арифметическое элементов 1го массива
        for (int i = 0; i < array1.length; i++) {
            sumArray1 = sumArray1 + array1[i];
        }
        averageSumArray1 = sumArray1 / array1.length;
        System.out.println("\nСрeднее арифметическое 1го массива: " + averageSumArray1);

        //Считаем среднее арифметическое элементов 2го массива
        for (int i = 0; i < array2.length; i++) {
            sumArray2 = sumArray2 + array2[i];
        }
        averageSumArray2 = sumArray2 / array2.length;
        System.out.println("Срeднее арифметическое 2го массива: " + averageSumArray2);


    }
}
