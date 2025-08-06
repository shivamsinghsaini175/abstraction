package abstraction.src.entity;

import abstraction.src.interfaces.Flyable;
import abstraction.src.interfaces.Swimable;

public class Ostrich extends Bird implements Swimable {

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("i eat alot");
    }

    @Override
    public void legs() {
        System.out.println(getName() +"have 2 legs and 2 wings but can't fly");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " ost ost");
    }


    @Override
    public void swim() {
        System.out.println(getName()+ "  can swim ");
    }

//    @Override
//    public String flyable(String name) {
//        System.out.println(getName()+ " cannot fly");
//
//    }
}
