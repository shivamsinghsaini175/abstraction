package abstraction;

public class Parrot extends Bird{


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(" my name is "+getName());
    }

    @Override
    public void legs() {
        System.out.println(getName() +"  have 2 legs and 2 wings");
    }

    @Override
    public void makeNoise() {
        System.out.println("parrot parrot");
    }

    @Override
    void fly() {
        System.out.println(getName()+ ": can fly");
    }
}
