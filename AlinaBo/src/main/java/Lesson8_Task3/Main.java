package Lesson8_Task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Cosmodrome cosmodrome = new Cosmodrome();

        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();

        cosmodrome.start(shuttle);
        cosmodrome.start(spaceX);


    }

}
