package Lesson8_Task3;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean isSystemChecked() {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        return randomNumber > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла...");
    }
}
