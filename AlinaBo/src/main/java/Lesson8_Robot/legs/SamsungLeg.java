package Lesson8_Robot.legs;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
