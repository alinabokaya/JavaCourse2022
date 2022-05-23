package Lesson3;

public class Task1 {
//    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//    массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//    созданием массива подумайте, какого он будет размера.

    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        int arraySize = 0;
        int arrayIndex = 0;

        // Узнаём размер массива
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                arraySize = arraySize +1;
            }
        }
        Integer[] array = new Integer[arraySize];

        // Наполняем массив чётными числами
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                array[arrayIndex] = i;
                arrayIndex = arrayIndex + 1;
            }
        }

        // Выводим на экран в строку
        System.out.print("В строку: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Выводим на экран в столбец
        System.out.println("\nВ столбец: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
