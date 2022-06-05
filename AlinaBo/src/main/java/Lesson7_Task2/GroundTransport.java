package Lesson7_Task2;

public class GroundTransport extends Transport{

    private int wheelAmount;
    private int fuelConsumption;


    public GroundTransport(int horsePower, int maxSpeed, int weight, String transportModel, int wheelAmount, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, transportModel);
        this.wheelAmount = wheelAmount;
        this.fuelConsumption = fuelConsumption;

    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printInfo() {

    }
}
