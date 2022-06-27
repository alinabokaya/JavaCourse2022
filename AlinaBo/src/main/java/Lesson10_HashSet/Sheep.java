package Lesson10_HashSet;

import java.util.*;

public class Sheep {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        //Добавление
        h.add("Катюша");
        h.add("Роза");
        h.add("Белянка");
        System.out.println("Начальный список овец: " + h);

        //Удаление
        System.out.println("Список содержит овечку Розуили нет: " +
                h.contains("Роза"));
        h.remove("Роза");
        System.out.println("\nУдалили Розу: " + h);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("\nОставшиеся овцы: ");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());


        //Изменение
        System.out.println("\nСписок содержит овечку Дори или нет: "
                + h.contains("Дори"));
        h.add("Дори");
        System.out.println("Изменённый список (добавили Дори): " + h);

        //Сортировка TreeSet
        TreeSet sortedSet = new TreeSet(h);
        sortedSet.addAll(sortedSet);
        System.out.println("\nОтсортированный список1: " + sortedSet);

        //Сортировка сохранением в лист
        List sortedList = new ArrayList(h);
        Collections.sort(sortedList);
        System.out.println("Отсортированный список2: " + sortedList);

    }
}
