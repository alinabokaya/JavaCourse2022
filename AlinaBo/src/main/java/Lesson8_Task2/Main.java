package Lesson8_Task2;

import Lesson8_Task2.Boots.AdidasBoots;
import Lesson8_Task2.Boots.IBoots;
import Lesson8_Task2.Boots.PumaBoots;
import Lesson8_Task2.Jacket.ChanelJacket;
import Lesson8_Task2.Jacket.IJacket;
import Lesson8_Task2.Jacket.PradaJacket;
import Lesson8_Task2.Pants.GucciPants;
import Lesson8_Task2.Pants.IPants;
import Lesson8_Task2.Pants.LevisPants;

public class Main {

    public static void main(String[] args) {

        IBoots adidasBoots = new AdidasBoots();
        IBoots pumaBoots = new PumaBoots();

        IJacket chanelJacket = new ChanelJacket();
        IJacket pradaJacket = new PradaJacket();

        IPants levisPants = new LevisPants();
        IPants gucciPants = new GucciPants();


        IHuman human1 = new Human("Андрей", adidasBoots, chanelJacket, levisPants);
        human1.printName();
        human1.putOn();
        human1.takeOff();

        IHuman human2 = new Human("Алина", pumaBoots, pradaJacket, gucciPants);
        System.out.println();
        human2.printName();
        human2.putOn();
        human2.takeOff();
    }


}
