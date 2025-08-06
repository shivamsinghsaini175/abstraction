package abstraction;

public class Fish extends Animal{


    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "eats sea grass");
    }

    @Override
    public void legs() {
        System.out.println(getName()+" fish has wings and fins");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " fis fis fis");
    }
}
