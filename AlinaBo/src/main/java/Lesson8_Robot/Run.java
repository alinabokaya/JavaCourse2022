package Lesson8_Robot;

import Lesson8_Robot.hands.IHand;
import Lesson8_Robot.hands.SamsungHand;
import Lesson8_Robot.hands.SonyHand;
import Lesson8_Robot.hands.ToshibaHand;
import Lesson8_Robot.heads.IHead;
import Lesson8_Robot.heads.SamsungHead;
import Lesson8_Robot.heads.SonyHead;
import Lesson8_Robot.heads.ToshibaHead;
import Lesson8_Robot.legs.ILeg;
import Lesson8_Robot.legs.SamsungLeg;
import Lesson8_Robot.legs.SonyLeg;
import Lesson8_Robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        //Инициализация объектов голов разных моделей
        IHead sonyHead = new SonyHead(100);
        IHead samsungHead = new SamsungHead(10);
        IHead toshibaHead = new ToshibaHead(30);


        //Инициализация объектов рук разных моделей
        IHand sonyHand = new SonyHand(300);
        IHand samsungHand = new SamsungHand(20);
        IHand toshibaHand = new ToshibaHand(30);


        //Инициализация объектов ног разных моделей
        ILeg sonyLeg = new SonyLeg(2);
        ILeg samsungLeg = new SamsungLeg(3);
        ILeg toshibaLeg = new ToshibaLeg(4);


        IRobot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        robot1.action();
        System.out.println("Стоимость 1го робота: " + robot1.getPrice() + "\n");


        IRobot robot2 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robot2.action();
        System.out.println("Стоимость 2го робота: " + robot2.getPrice() + "\n");


        IRobot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);
        robot3.action();
        System.out.println("Стоимость 3го робота: " + robot3.getPrice() + "\n");


        int higherPrice = Math.max(Math.max(robot1.getPrice(), robot2.getPrice()), robot3.getPrice());
        System.out.println("Самая высокая цена = " + higherPrice);

        if (higherPrice == robot1.getPrice()) {
            System.out.println("1ый робот самый дорогой!");
        }
        if (higherPrice == robot2.getPrice()) {
            System.out.println("2ой робот самый дорогой!");
        }
        if (higherPrice == robot3.getPrice()) {
            System.out.println("3ий робот самый дорогой!");
        }
    }
}
