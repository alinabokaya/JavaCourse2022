package Lesson8_Task2.Pants;

public class GucciPants implements IPants{

    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Gucci");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Gucci");
    }
}
