package Lesson7_Task2;

public class MilitaryAirTransport extends AirTransport {

    private boolean isEjectionSystemExists;
    private int rocketsAmount;

    public MilitaryAirTransport(int horsePower, int maxSpeed, int weight, String transportModel, int wingSpan, int minRunwayLength, boolean isEjectionSystemExists, int rocketsAmount) {
        super(horsePower, maxSpeed, weight, transportModel, wingSpan, minRunwayLength);
        this.isEjectionSystemExists = isEjectionSystemExists;
        this.rocketsAmount = rocketsAmount;
    }

    private double calculatePower() {
        return getHorsePower() * 0.74;
    }

    public void printInfo() {
        System.out.println("Military Transport Info");
        System.out.println("Horse power: " + getHorsePower());
        System.out.println("Max speed: " + getMaxSpeed());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getTransportModel());
        System.out.println("Ejection System: " + isEjectionSystemExists);
        System.out.println("Rockets amount: " + rocketsAmount);
        System.out.println("Capacity in kilowatts: " + calculatePower());
        System.out.println("\nЗапуск ракеты: ");
        shot();
        System.out.println("\nЗапуск катапультирования: ");
        ejection();
    }

    private void shot() {
        if (rocketsAmount > 0) {
            System.out.println("Ракета пошла");
            rocketsAmount -= 1;
        } else System.out.println("Боеприпасы отсутствуют");
    }

    private void ejection() {
        if (isEjectionSystemExists) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }
}
