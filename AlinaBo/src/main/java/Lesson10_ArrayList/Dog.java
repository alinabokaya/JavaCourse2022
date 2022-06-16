package Lesson10_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        Dog borderCollie = new Dog("Альфа");
        Dog goldenRetriever = new Dog("Лаки");
        Dog shepherd = new Dog("Волчок");
        Dog noBreed = new Dog("Куська");

        //Добавление
        dogs.add(borderCollie);
        dogs.add(goldenRetriever);
        dogs.add(shepherd);
        dogs.add(noBreed);

        System.out.println("Начальный список: " + dogs.toString());

        //Удаление по объекту
        dogs.remove(noBreed);
        System.out.println("\nУдалили бродягу: " + dogs.toString());

        //Поиск индекса + удаление по индексу
        int goldenRetrieverIndex = dogs.indexOf(goldenRetriever);
        System.out.println("\nИндекс ретривера = " + goldenRetrieverIndex);

        dogs.remove(goldenRetrieverIndex);
        System.out.println("Удалили ретривера: " + dogs.toString());

        //Изменение
        dogs.add(0, noBreed);
        dogs.set(0, goldenRetriever);
        System.out.println("\nИзменённый список: " + dogs.toString());

        //Сортировка
        dogs.sort(Comparator.comparing(Dog::getName));
        System.out.println("\nОтсортированный список собачек по именам: ");
        dogs.forEach(System.out::println);

        Collections.reverse(dogs);
        System.out.println("\nПеревёрнутый список собачек по именам: ");
        dogs.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Dog{" +
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
