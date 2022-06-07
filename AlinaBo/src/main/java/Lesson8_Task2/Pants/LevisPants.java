package Lesson8_Task2.Pants;

public class LevisPants implements IPants{

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Levis");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Levis");
    }
}
