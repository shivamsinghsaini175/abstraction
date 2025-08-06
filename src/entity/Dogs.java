package abstraction.src.entity;

public class Dogs extends Animal{

    public Dogs(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "bow bow ");
    }

    @Override
    public void legs() {
        System.out.println(getName() + "  has 4 legs bigger than cat");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() +" bhow bhow");
    }

    public void play() {
        System.out.println(getName()+ " plays alot");
    }
}
