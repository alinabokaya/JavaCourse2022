package Lesson5_Task2;

public class Computer {

    private double price;
    private String model;

    Ram ram = new Ram();
    Hdd hdd = new Hdd();

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public void printInfo( ) {
        System.out.println("Computer price: " + price + "\nComputer model: " + model);
    }
}
