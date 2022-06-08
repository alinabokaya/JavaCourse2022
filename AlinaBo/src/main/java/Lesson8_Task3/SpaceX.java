package Lesson8_Task3;

import java.util.Random;

public class SpaceX implements IStart{

    @Override
    public boolean isSystemChecked() {
        Random random = new Random();
        boolean isIlonMaskHappy = random.nextBoolean();
        return isIlonMaskHappy;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Космического Корабля запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Космического Корабля");
    }
}
