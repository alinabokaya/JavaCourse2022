package Lesson8_Task2.Boots;

public class PumaBoots implements IBoots{

    @Override
    public void putOn() {
        System.out.println("Надеваю ботинки Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю ботинки Puma");
    }
}
