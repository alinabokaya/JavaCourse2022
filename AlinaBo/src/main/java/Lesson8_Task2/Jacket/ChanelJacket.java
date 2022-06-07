package Lesson8_Task2.Jacket;

public class ChanelJacket implements IJacket{

    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Chanel");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Chanel");
    }
}
