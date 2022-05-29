package Lesson5_Task2;

public class Computer {

    private double price;
    private String model;
    private Ram ram;
    private Hdd hdd;


    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double price, String model, String ramModelName, int ramMemoryValue, String hddModelName, int hddMemoryValue, boolean isInternalType) {
        this.price = price;
        this.model = model;
        this.ram = new Ram(ramModelName, ramMemoryValue);
        this.hdd = new Hdd(hddModelName, hddMemoryValue, isInternalType);
    }

    public void printInfo() {
        System.out.println("Computer price: " + price + "\nComputer model: " + model);
        ram.printInfo();
        hdd.printInfo();
    }
}
