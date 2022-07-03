package tasks_from_lesha;

import java.util.*;

public class Task3 {
    //Дан лист целых чисел от 1 до 100. В нём есть больше 1 дубликата.
    //Надо найти элементы, которые встречаются больше одного раза,
    // вывести в консоль сам элемент и сколько раз он встречается

    public static void main(String[] args) {

        Integer[] integers = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(101);
        }
        List<Integer> integerLinkedList = new ArrayList<>(Arrays.asList(integers));
        System.out.println(integerLinkedList);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : integerLinkedList) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element - " + entry.getKey() + ": found " + entry.getValue() + " times.");
            }
        }
    }
}
