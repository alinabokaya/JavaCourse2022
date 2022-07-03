package tasks_from_lesha;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    //Напишите метод, который на вход получает ArrayList,
    //а возвращает ArrayList уже без дубликатов.
    //Используя hashset и без него

    //ArrayList Тут имеет какой-то тип(Integer, например)
    //или нам надо сделать универсальное?

    //Давайте пусть будет лист стрингов

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("один");
        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("три");
        arrayList.add("три");

        //Удаление дубликатов с помощью метода distinct().
        System.out.println(arrayListRemoveDuplicates(arrayList));

        //Удаление дубликатов с помощью HashSet
        System.out.println(arrayListRemoveDuplicatesWithHashSet(arrayList));

    }

    public static ArrayList<String> arrayListRemoveDuplicates(ArrayList<String> arrayList) {
        List<String> listWithoutDuplicates =
                arrayList.stream().distinct().collect(Collectors.toList());
        ArrayList<String> arrayListWithoutDuplicates = new ArrayList<>(listWithoutDuplicates);

        return arrayListWithoutDuplicates;
    }

    public static ArrayList<String> arrayListRemoveDuplicatesWithHashSet(ArrayList<String> arrayList) {
        // помещаем коллекцию в сет
        Set<String> set = new LinkedHashSet<>(arrayList);
        // чистим  коллекцию
        arrayList.clear();
        // помещаем из коллекции сета обратно в вашу коллекцию,
        arrayList.addAll(set);

        return arrayList;
    }


}
