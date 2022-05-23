package Lesson5_Task2;

public class Ram {
    String modelName;
    int memoryValue;

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
