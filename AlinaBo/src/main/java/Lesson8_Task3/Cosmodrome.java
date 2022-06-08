package Lesson8_Task3;

public class Cosmodrome {


    public void start(IStart start) throws InterruptedException {
        if (!start.isSystemChecked()) {
            System.out.println("Предстартовая проверка провалена!");
        } else {
            start.engineStart();
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(10 - i);
            }
            start.start();
        }
    }
}
