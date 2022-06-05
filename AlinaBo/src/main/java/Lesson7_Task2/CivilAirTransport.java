package Lesson7_Task2;

public class CivilAirTransport extends AirTransport{

    private int passengersAmount;
    private boolean isBusinessClassExists;

    public CivilAirTransport(int horsePower, int maxSpeed, int weight, String transportModel, int wingSpan, int minRunwayLength, int passengersAmount, boolean isBusinessClassExists) {
        super(horsePower, maxSpeed, weight, transportModel, wingSpan, minRunwayLength);
        this.passengersAmount = passengersAmount;
        this.isBusinessClassExists = isBusinessClassExists;
    }

    private double calculatePower() {
        return getHorsePower() * 0.74;
    }

    public void printInfo() {
        System.out.println("Civil Air Transport Info -->");
        System.out.println("Horse power: " + getHorsePower());
        System.out.println("Max speed: " + getMaxSpeed());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getTransportModel());
        System.out.println("Passengers amount capacity: " + passengersAmount);
        System.out.println("Business class: " + isBusinessClassExists);
        System.out.println("Capacity in kilowatts: " + calculatePower());
    }

    private void calculatePassengersCapacity(int passengersToSeat) {
        if (passengersToSeat <= passengersAmount) {
            System.out.println("Самолёт загружен");
        } else System.out.println("Вам нужен самолёт побольше");
    }

}
