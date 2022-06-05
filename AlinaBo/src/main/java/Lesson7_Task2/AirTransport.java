package Lesson7_Task2;

public class AirTransport extends Transport{

    private int wingSpan;
    private int minRunwayLength;

    public AirTransport(int horsePower, int maxSpeed, int weight, String transportModel, int wingSpan, int minRunwayLength) {
        super(horsePower, maxSpeed, weight, transportModel);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void printInfo() {

    }
}
