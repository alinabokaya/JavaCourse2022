package Lesson7_Task2;

public class Main {

    public static void main (String[] args) {

        Transport passengerVehicle = new PassengerVehicle(87, 130, 2000,
                "Honda",4,9, "Sedan", 5);
        passengerVehicle.printInfo();

        Transport truckTransport = new TruckTransport(107, 100, 3000,
                "MAZ", 12, 18, 100);
        truckTransport.printInfo();

        Transport civilAirTransport = new CivilAirTransport(300, 500, 10000,
                "Boeing", 30, 25, 250, true);
        civilAirTransport.printInfo();

        Transport militaryAirTransport = new MilitaryAirTransport(400, 500, 20000,
                "Aerobus", 40, 55, true, 3);
        militaryAirTransport.printInfo();

    }
}
