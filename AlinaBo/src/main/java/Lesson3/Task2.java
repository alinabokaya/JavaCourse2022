package Lesson3;

public class Task2 {
//    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//    строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//    порядке (99 97 95 93 ... 7 5 3 1).

    public static void main(String[] args) {
        int numStart = 1;
        int numEnd = 99;
        int arraySize = 0;
        int arrayIndex = 0;

        // Узнаём размер массива
        for (int i = numStart; i <= numEnd; i++) {
            if (i % 2 != 0) {
                arraySize = arraySize + 1;
            }
        }

        Integer[] array = new Integer[arraySize];

        // Наполняем массив нечётными числами
        for (int i = numStart; i <= numEnd; i++) {
            if (i % 2 != 0) {
                array[arrayIndex] = i;
                arrayIndex = arrayIndex + 1;
            }
        }

        // Выводим на экран в строку
        System.out.print("В строку: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Выводим на экран в строку + в обратном порядке
        System.out.print("\nВ строку + в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

