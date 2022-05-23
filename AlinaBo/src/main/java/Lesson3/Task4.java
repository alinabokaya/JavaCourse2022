package Lesson3;

import java.util.Random;

public class Task4 {
//    Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//    массив на экран в строку. Замените каждый элемент с нечётным индексом на
//    ноль. Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {

        Random random = new Random(); // Создаём объект типа Random
        Integer[] array = new Integer[20]; // создаём одномерный массив длиной = 20

        // Наполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20); // заполняем массив случайными числами от 0 до 20
        }

        // Выводим массив на экран
        System.out.print("Массив без изменений: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Заменяем элементы с нечётным индексом на 0 и выводим массив на экран
        System.out.print("\nМассив с изменениями: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
