package Lesson6_Task2;

public class Main {

    public static void main(String[] args) {

        Accountant accountant = new Accountant("Chief Accountant");
        Worker worker = new Worker("Junior Worker");
        Director director = new Director("Super Director");

        accountant.printJobTitle();
        worker.printJobTitle();
        director.printJobTitle();
    }
}
