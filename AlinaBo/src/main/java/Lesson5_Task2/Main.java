package Lesson5_Task2;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer(850.5, "Lenovo");
        Computer computer2 = new Computer(600, "ASUS", "Super", 8, "Seagate", 500, true);

        computer1.printInfo();
        computer2.printInfo();
    }
}
