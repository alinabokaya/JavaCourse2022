package Lesson8_Task2.Boots;

public class AdidasBoots implements IBoots{


    @Override
    public void putOn() {
        System.out.println("Надеваю ботинки Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю ботинки Adidas");
    }
}
