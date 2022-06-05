package Lesson7_Task2;

import java.util.Scanner;

public class PassengerVehicle extends GroundTransport {

    private String typeOfBody;
    private int passengersAmount;


    public PassengerVehicle(int horsePower, int maxSpeed, int weight, String transportModel, int wheelAmount, int fuelConsumption, String typeOfBody, int passengersAmount) {
        super(horsePower, maxSpeed, weight, transportModel, wheelAmount, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.passengersAmount = passengersAmount;
    }


    private double calculatePower() {
        return getHorsePower() * 0.74;
    }

    public void printInfo() {
        System.out.println("Passenger Transport Info -->");
        System.out.println("Horse power: " + getHorsePower());
        System.out.println("Max speed: " + getMaxSpeed());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getTransportModel());
        System.out.println("Wheels: " + getWheelAmount());
        System.out.println("Fuel consumption: " + getFuelConsumption());
        System.out.println("Type of body: " + typeOfBody);
        System.out.println("Passengers: " + passengersAmount);
        System.out.println("Capacity in kilowatts: " + calculatePower());
        System.out.println();
        calculateDistance();

    }

    private void calculateDistance() {

        System.out.println("Enter time in minutes to calculate distance and used fuel: ");
        Scanner sc = new Scanner(System.in);
        double enteredMinutes = sc.nextDouble();

        double distance = (enteredMinutes/60) * getMaxSpeed();
        double fuelUsed = (distance / 100) * getFuelConsumption();

        System.out.println("За время " + enteredMinutes + " автомобиль " + getTransportModel() +
                ", двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " +
                distance + " км и израсходует " + getFuelConsumption() + " литров топлива.\n");

    }
}
