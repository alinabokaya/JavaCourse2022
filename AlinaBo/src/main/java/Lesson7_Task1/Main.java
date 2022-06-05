package Lesson7_Task1;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Intel", "Super", "Puper", 3);
        computer.printComputerInfo();

        computer.turnOn();
        computer.turnOff();

        computer.turnOn();
        computer.turnOff();

        computer.turnOn();
        computer.turnOff();

        computer.turnOn();

    }
}
