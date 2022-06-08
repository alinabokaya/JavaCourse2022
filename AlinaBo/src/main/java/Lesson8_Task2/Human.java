package Lesson8_Task2;

import Lesson8_Task2.Boots.IBoots;
import Lesson8_Task2.Jacket.IJacket;
import Lesson8_Task2.Pants.IPants;

public class Human implements IHuman{

    private String name;
    private IBoots boots;
    private IJacket jacket;
    private IPants pants;


    public Human(String name, IBoots boots, IJacket jacket, IPants pants) {
        this.name = name;
        this.boots = boots;
        this.jacket = jacket;
        this.pants = pants;
    }


    @Override
    public void putOn() {
        boots.putOn();
        jacket.putOn();
        pants.putOn();
    }

    @Override
    public void takeOff() {
        boots.takeOff();
        jacket.takeOff();
        pants.takeOff();
    }

    @Override
    public void printName() {
        System.out.println("Человека зовут: " + name);
    }

}
