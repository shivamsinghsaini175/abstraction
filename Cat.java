package abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats jum jum jum");
    }

    @Override
    public void legs() {
        System.out.println(getName() +" have 4 legs");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + "meow meow meow");
    }

}
