package abstraction;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void legs();

    public abstract void makeNoise();

    public  void sleep(){
       System.out.println(" animal sleeps");
    }

}
