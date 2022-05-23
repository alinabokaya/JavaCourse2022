package Lesson5_Task2;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer(850.5, "Lenovo");
        Computer computer2 = new Computer(450.99, "ASUS", new Ram(), new Hdd());

        computer1.printInfo();
        computer1.ram.printInfo();
        computer1.hdd.printInfo();

        computer2.printInfo();
        computer2.ram.printInfo();
        computer2.hdd.printInfo();

    }
}
