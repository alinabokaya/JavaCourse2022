package Lesson1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Cycle_Task8 {
    public static void main(String[] args) {
        int a, b;
        int arrayASize, arrayBSize;

        // Получили 2 числа на ввод от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();


        // Перевели наши числа в строки
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        // Преобразуем строку в массив символов
        char[] charsA = strA.toCharArray();
        char[] charsB = strB.toCharArray();

        // Сортируем наши массивы символов
        Arrays.sort(charsA);
        Arrays.sort(charsB);

        // Используя СтрингБилдер объявили новую строку и добавили в нее первый символ массива (индекс 0)
        StringBuilder sortedStrA = new StringBuilder();
        sortedStrA.append(charsA[0]);
        // Выполнили фильтрацию повторяющихся элементов массива и добавили уникальные в строку
        for (int i = 1; i < charsA.length; i++) {
            if (charsA[i] != charsA[i - 1]) {
                sortedStrA.append(charsA[i]);
            }
        }
        System.out.println("Отсортированная и избавленная от дубликатов строка A: " + sortedStrA);

        // Повторили для второго массива
        StringBuilder sortedStrB = new StringBuilder();
        sortedStrB.append(charsB[0]);

        for (int i = 1; i < charsB.length; i++) {
            if (charsB[i] != charsB[i - 1]) {
                sortedStrB.append(charsB[i]);
            }
        }
        System.out.println("Отсортированная и избавленная от дубликатов строка B: " + sortedStrB);

       // Создали результирующую строку и сравнили в FOR 2 строки на повторяющиеся элементы и добавили их в неё
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortedStrA.length(); i++) {
            for (int j = 0; j < sortedStrB.length(); j++) {
                if (sortedStrA.charAt(i) == sortedStrB.charAt(j)) {
                    result.append(sortedStrB.charAt(j));
                }
            }
        }

        System.out.println(result);

    }
}
