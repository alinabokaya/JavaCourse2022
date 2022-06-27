package Lesson10_HashMap;

import java.util.*;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> idsAndCats = new HashMap<>();

        //Добавление
        idsAndCats.put(123, "Лушка");
        idsAndCats.put(456, "Васька");
        idsAndCats.put(789, "Барсик");
        idsAndCats.put(111, "Мурка");
        System.out.println("Начальный список (id и имена котов): " + idsAndCats);

        //Удаление
        System.out.println("Список содержит кота Барсика или нет: " +
                idsAndCats.containsValue("Барсик"));
        System.out.println("\nСоответветствие ключей и значений -->");
        Set<Integer> keys = idsAndCats.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(idsAndCats.values());
        System.out.println("Значения: " + values);

        idsAndCats.remove(789);
        System.out.println("\nУдалили Барсика: " + idsAndCats);

        //Изменение
        for (Map.Entry entry : idsAndCats.entrySet()) {
            System.out.println(entry);
        }
        idsAndCats.put(456, "Тимоша");
        System.out.println("Перезаписали Ваську: " + idsAndCats);

        //Объединение двух Map
        HashMap<Integer, String> idsAndCats2 = new HashMap<>();

        idsAndCats2.put(222, "Рыжик");
        idsAndCats2.put(333, "Пушок");

        idsAndCats.putAll(idsAndCats2);
        System.out.println("\nОбъединённый список: " + idsAndCats);


        //Сортировка
        TreeMap<Integer, String> sortedMap = new TreeMap<>(idsAndCats);
        System.out.println("Отсортированный список по ключам: " + sortedMap);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
