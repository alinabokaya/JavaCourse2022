package Lesson5_Task2;

public class Ram {
    private String modelName;
    private int memoryValue;

    // Создаём конструкторы по умолчанию и со всеми полями
    public Ram() {
    }

    public Ram(String modelName, int memoryValue) {
        this.modelName = modelName;
        this.memoryValue = memoryValue;
    }

    public void printInfo() {
        System.out.println("RAM model name: " + modelName + "\nRAM memory value: " + memoryValue);
    }

}
