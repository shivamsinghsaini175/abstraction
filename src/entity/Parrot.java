package abstraction.src.entity;

import abstraction.src.interfaces.Flyable;
import abstraction.src.interfaces.Swimable;

public class Parrot extends Bird implements Swimable {



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
    public void swim() {
        System.out.println(getName()+ " can't swim");
    }





//    public void sums(String[] numb)
//    {
//        int sum=0;
//        for (String num:numb)
//        {
//            sum+=Integer.parseInt(String.valueOf(num));
//
//        }
//        System.out.println("sum is "+sum);
//    }

}
