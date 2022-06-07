package Lesson7_Task1;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String cpu;
    private String ram;
    private String hdd;
    private int cyclesResource;
    private int actualCyclesAmount = 0;
    private boolean isAlive = true;
    private boolean isOn;


    public Computer(String cpu, String ram, String hdd, int cyclesResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cyclesResource = cyclesResource;

    }

    public void printComputerInfo() {
        System.out.println("Processor model is: " + cpu + "\nRAM model is: " + ram + "\nHDD model is: " + hdd + "\nWork cycles limit is: " + cyclesResource);
    }

    public void turnOn() {
        System.out.print("Attempt to turn ON --> ");

        if (!isOn) {
            if (isAlive) {
                if (actualCyclesAmount != cyclesResource) {
                    Random random = new Random();
                    int randomNumber = random.nextInt(2);
                    int enteredNumber = userInput();

                    if (enteredNumber == randomNumber) {
                        isOn = true;
                        System.out.println("Computer is ON!");
                    } else {
                        isAlive = false;
                        System.out.println("Computer burned out!");
                    }
                } else {
                    isAlive = false;
                    System.out.println("Computer burned out!");
                }
            } else {
                System.out.println("Computer burned out!");
            }
        } else {
            System.out.println("Computer has been already turned ON!");
        }
    }

    public void turnOff() {
        System.out.print("Attempt to turn OFF --> ");

        if (isOn) {
            Random random = new Random();
            int randomNumber = random.nextInt(2);
            int enteredNumber = userInput();

            if (enteredNumber == randomNumber) {
                actualCyclesAmount += 1;
                isOn = false;
                System.out.println("Computer is OFF!");
            } else {
                isAlive = false;
                System.out.println("Computer burned out!");
            }

        } else {
            System.out.println("Computer has been already turned OFF!");
        }
    }

    public int userInput() {
        int enteredNumber;
        boolean isCorrectInput = false;
        do {
            System.out.println("Enter 0 or 1: ");
            Scanner sc = new Scanner(System.in);
            enteredNumber = sc.nextInt();

            if (enteredNumber == 0 || enteredNumber == 1) {
                isCorrectInput = true;
            } else System.out.println("Incorrect input range! Please try again!");
        } while (!isCorrectInput);

        return enteredNumber;
    }
}
