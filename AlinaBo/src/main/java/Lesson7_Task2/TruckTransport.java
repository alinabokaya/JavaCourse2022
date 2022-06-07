package Lesson7_Task2;

public class TruckTransport extends GroundTransport{

    private int loadCapacity;

    public TruckTransport(int horsePower, int maxSpeed, int weight, String transportModel, int wheelAmount, int fuelConsumption, int loadCapacity) {
        super(horsePower, maxSpeed, weight, transportModel, wheelAmount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    private double calculatePower() {
        return getHorsePower() * 0.74;
    }

    public void printInfo() {
        System.out.println("Truck Transport Info -->");
        System.out.println("Horse power: " + getHorsePower());
        System.out.println("Max speed: " + getMaxSpeed());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getTransportModel());
        System.out.println("Wheels: " + getWheelAmount());
        System.out.println("Fuel consumption: " + getFuelConsumption());
        System.out.println("Load capacity: " + loadCapacity);
        System.out.println("Capacity in kilowatts: " + calculatePower());
        System.out.println();
    }

    public void calculateCargoCapacity(int cargoAmount) {
        if (cargoAmount <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
    }
}
