package Lesson8_Robot.hands;


public class SamsungHand implements IHand {

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }


    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }


}
