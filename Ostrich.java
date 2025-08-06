package abstraction;

public class Ostrich extends Bird{

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
    void fly() {
        System.out.println("i cannot fly");
    }
}
