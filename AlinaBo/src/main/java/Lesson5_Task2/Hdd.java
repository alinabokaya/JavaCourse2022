package Lesson5_Task2;

public class Hdd {
    private String modelName;
    private int memoryValue;
    private boolean isInternalType;

    // Создаём конструкторы по умолчанию и со всеми полями
    public Hdd() {
    }

    public Hdd(String modelName, int memoryValue, boolean isInternalType) {
        this.modelName = modelName;
        this.memoryValue = memoryValue;
        this.isInternalType = isInternalType;
    }

    public void printInfo() {
        System.out.println("HDD model name: " + modelName + "\nHDD memory value: " + memoryValue);
        if (isInternalType) {
            System.out.println("HDD type is internal\n");
        } else System.out.println("HDD type is external\n");
    }
}
